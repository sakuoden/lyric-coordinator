package domain.lyric;

import java.util.List;

public class Lyric {
    List<Verse> verseList;

    Lyric(List<Verse> verseList) {
        this.verseList = verseList;
    }

    public static Lyric of(List<Verse> verseList) {
        return new Lyric(verseList);
    }

    public String toHtml() {
        List<String> verseListHtml = verseList
                .stream()
                .map(Verse::toHtml)
                .toList();

        return String.join(System.lineSeparator(), verseListHtml);
    }

    @Override
    public String toString() {
        return "Lyric{" +
                "verseList=" + verseList +
                '}';
    }
}
