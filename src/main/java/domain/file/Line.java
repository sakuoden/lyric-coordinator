package domain.file;

public class Line {
    String value;

    Line(String value) {
        this.value = value;
    }

    public static Line of(String line) {
        return new Line(line);
    }

    public boolean isOnlyLineBreak() {
        return value.isBlank();
    }

    @Override
    public String toString() {
        return value;
    }
}
