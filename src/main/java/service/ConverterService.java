package service;

import domain.file.Line;
import domain.lyric.Bar;
import domain.lyric.FourBars;
import domain.lyric.Lyric;
import domain.lyric.Verse;

import java.util.ArrayList;
import java.util.List;

public class ConverterService {
    Lyric lyric;

    ConverterService(Lyric lyric) {
        this.lyric = lyric;
    }

    public static ConverterService from(List<Line> lines) {
        int rowNumber = 0;
        List<Bar> barList = new ArrayList<>();
        List<FourBars> fourBarsList = new ArrayList<>();
        List<Verse> verseList = new ArrayList<>();

        for (Line line : lines) {
            if (line.isOnlyLineBreak()) {
                Verse verse = Verse.of(fourBarsList);
                verseList.add(verse);
                fourBarsList = new ArrayList<>();
                continue;
            }

            rowNumber = rowNumber + 1;
            Bar bar = Bar.from(line.toString());
            barList.add(bar);
            if (rowNumber % 4 == 0) {
                FourBars fourBars = FourBars.of(barList);
                fourBarsList.add(fourBars);
                barList = new ArrayList<>();
            }
        }

        Lyric lyric = Lyric.of(verseList);

        return new ConverterService(lyric);
    }

    public Lyric toLyric() {
        return lyric;
    }
}
