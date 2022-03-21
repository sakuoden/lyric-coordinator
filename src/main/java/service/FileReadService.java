package service;

import domain.file.File;
import domain.file.Line;

import java.util.List;

public class FileReadService {
    List<Line> lines;

    FileReadService(List<Line> lines) {
        this.lines = lines;
    }

    public static FileReadService from(String lyricTextPath) {
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
