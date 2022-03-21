package domain.lyric;

public class Bar {
    String value;

    Bar(String value) {
        this.value = value;
    }

    public static Bar from(String bar) {
        return new Bar(bar);
    }

    public String toHtml() {
        return String.format("%s<br>", value);
    }

    @Override
    public String toString() {
        return value;
    }
}
