package service;

import domain.file.File;
import domain.file.Line;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadService {
    File file;

    FileReadService(File file) {
        if (! file.isValid()) throw new IllegalArgumentException("Invalid file type");
        this.file = file;
    }

    public static FileReadService fileName(String fileName) {
        String fileNameWithResources = String.format("src/main/resources/%s", fileName);
        Path path = Paths.get(fileNameWithResources);
        return path(path.toAbsolutePath().toString());
    }

    public static FileReadService path(String lyricTextPath) {
        File file = File.from(lyricTextPath);
        return new FileReadService(file);
    }

    public List<Line> toLines() {
        return file.lines();
    }

    @Override
    public String toString() {
        return "FileReadService{" +
                "file=" + file +
                '}';
    }
}
