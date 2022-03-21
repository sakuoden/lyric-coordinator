package infrastructure;

import domain.FileType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class File {
    Path path;

    File(Path path) {
        java.io.File file = path.toFile();
        if (! file.exists()) throw new IllegalArgumentException("File Not Found");
        if (! file.canRead()) throw new IllegalArgumentException("Unreadable file is invalid.");
        this.path = path;
    }

    public static File from(String path) {
        return new File(Paths.get(path));
    }

    public boolean isValid() {
        return Arrays.stream(FileType.values())
                .anyMatch(validFileType -> {
                    String thisFileType = extension();
                    return validFileType.name().equals(thisFileType);
                });
    }

    public String name() {
        return path.getFileName().toString();
    }

    public String extension() {
        String fileName = name();
        int index = fileName.lastIndexOf(".");
        return fileName.substring(index + 1);
    }

    public String readToString() {
        try {
            return Files.readString(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Failed to read file");
        }
    }

    @Override
    public String toString() {
        return path.toAbsolutePath().toString();
    }
}
