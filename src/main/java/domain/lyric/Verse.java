package domain.lyric;

import java.util.List;

public class Verse {
    List<FourBars> fourBarsList;

    Verse(List<FourBars> fourBarsList) {
        this.fourBarsList = fourBarsList;
    }

    public static Verse of(List<FourBars> fourBarsList) {
        return new Verse(fourBarsList);
    }

    public String toHtml() {
        List<String> fourBarsHtmlList = fourBarsList
                .stream()
                .map(FourBars::toHtml)
                .toList();

        return String.format(
                "<p>%s" +
                    "%s%s" +
                "</p>",
                System.lineSeparator(),
                String.join(System.lineSeparator(), fourBarsHtmlList),
                System.lineSeparator()
        );
    }

    @Override
    public String toString() {
        return "Verse{" +
                "fourBarsList=" + fourBarsList +
                '}';
    }
}
