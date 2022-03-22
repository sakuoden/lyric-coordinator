package service;

import domain.file.File;
import domain.file.Line;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadService {
    List<Line> lines;

    FileReadService(List<Line> lines) {
        this.lines = lines;
    }

    public static FileReadService fileName(String fileName) {
        String fileNameWithResources = String.format("src/main/resources/%s", fileName);
        Path path = Paths.get(fileNameWithResources);
        return path(path.toAbsolutePath().toString());
    }

    public static FileReadService path(String lyricTextPath) {
        File lyricFile = File.from(lyricTextPath);
        if (! lyricFile.isValid()) throw new IllegalArgumentException("Invalid file type");

        List<Line> lines = lyricFile.lines();
        
        return new FileReadService(lines);
    }

    public List<Line> toLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "InputService{" +
                "lines=" + lines +
                '}';
    }
}
