import domain.file.Line;
import domain.lyric.Lyric;
import service.ConverterService;
import service.FileReadService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String fileName = args[0];

        List<Line> lines = FileReadService.fileName(fileName).toLines();

        Lyric lyric = ConverterService.from(lines).toLyric();

        System.out.println(lyric.toHtml());
    }
}
