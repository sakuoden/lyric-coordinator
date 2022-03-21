package infrastructure;

public class InputService {
    String lyric;

    InputService(String lyric) {
        this.lyric = lyric;
    }

    public static InputService from(String lyricTextPath) {
        File lyricFile = File.from(lyricTextPath);
        if (! lyricFile.isValid()) throw new IllegalArgumentException("Invalid file type");

        return new InputService(lyricFile.readToString());
    }

    @Override
    public String toString() {
        return lyric;
    }
}
