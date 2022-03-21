package domain.lyric;

import java.util.List;

public class FourBars {
    List<Bar> fourBars;

    FourBars(List<Bar> fourBars) {
        if (fourBars.size() != 4) throw new IllegalArgumentException("Invalid number of bars");
        this.fourBars = fourBars;
    }

    public static FourBars of(List<Bar> fourBars) {
        return new FourBars(fourBars);
    }

    public String toHtml() {
        List<String> barsHtmlList = fourBars
                .stream()
                .map(Bar::toHtml)
                .toList();

        return String.format(
                "<span>%s" +
                    "%s%s" +
                "</span>",
                System.lineSeparator(),
                String.join(System.lineSeparator(), barsHtmlList),
                System.lineSeparator()
        );
    }

    @Override
    public String toString() {
        return "FourBars{" +
                "fourBars=" + fourBars +
                '}';
    }
}
