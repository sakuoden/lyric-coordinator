import domain.file.Line;
import domain.lyric.Lyric;
import service.ConverterService;
import service.FileReadService;
import org.junit.jupiter.api.Test;
import path.ForTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateTest {
    @Test
    void toHtml() {
        List<Line> lines = FileReadService.path(ForTest.fileAbsolutePath()).toLines();

        // TODO 必要だったら読み込んだ文章の整形サービスを作る

        Lyric lyric = ConverterService.from(lines).toLyric();

        assertEquals(expected(), lyric.toHtml());
    }

    private String expected() {
        return "<p>\n" +
                "<span>\n" +
                "「友達」つっても おもろない<br>\n" +
                "と思えば簡単にお断り<br>\n" +
                "言葉に出すほどでも無い<br>\n" +
                "ただ、どこかのデータ バインド代わりに<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "人間嫌いで進展しないのに<br>\n" +
                "地元の顔は新鮮じゃない<br>\n" +
                "普通な思い出をヴィンテージみたく<br>\n" +
                "飾る作品展示会<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "二十歳掲げた ダサい名前が<br>\n" +
                "優先順位の一番目だ<br>\n" +
                "もしも俺が一人だったら<br>\n" +
                "続かず あの日の昨日以下<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "どこかの肩書興味ない<br>\n" +
                "自分の言葉は飾らない<br>\n" +
                "お前に嫌われたって構わない<br>\n" +
                "立石に俺の仲間がいる<br>\n" +
                "</span>\n" +
                "</p>\n" +
                "<p>\n" +
                "<span>\n" +
                "言葉にするのは そりゃ簡単<br>\n" +
                "けど軽々しいのは違和感が<br>\n" +
                "ただ、他に表す術も無いな<br>\n" +
                "説明できないけど なんか<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "ずっと友達 なんて言わない<br>\n" +
                "無きゃ無いで なんか つまらない<br>\n" +
                "無駄ばかり 下らない日々<br>\n" +
                "無きゃ無いで なんか つまらない<br>\n" +
                "</span>\n" +
                "</p>\n" +
                "<p>\n" +
                "<span>\n" +
                "替えがいない存在 なんてない<br>\n" +
                "いなくても平気 誰だってさ<br>\n" +
                "何を愛し何を大事にしても一緒<br>\n" +
                "それら全て含めて<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "もしも一つ残らず記憶ごと削除<br>\n" +
                "したならば何事もなく<br>\n" +
                "揚々と違う人生を<br>\n" +
                "違和感なく生きてくだろう<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "ただ、たまたま会って また関わって<br>\n" +
                "それが重なって なんか仲間って<br>\n" +
                "なってたけど 全て偶然<br>\n" +
                "でも過ぎ去れば全て必然<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "そう俺が今意味付ける<br>\n" +
                "いや意味付けたい想いに気づける<br>\n" +
                "他の道もあった<br>\n" +
                "でもお前らで良かった<br>\n" +
                "</span>\n" +
                "</p>\n" +
                "<p>\n" +
                "<span>\n" +
                "言葉にするのは そりゃ簡単<br>\n" +
                "けど軽々しいのは違和感が<br>\n" +
                "ただ他に表す術も無いな<br>\n" +
                "説明できないけど なんか<br>\n" +
                "</span>\n" +
                "<span>\n" +
                "ずっと友達 なんて言わない<br>\n" +
                "無きゃ無いで なんか つまらない<br>\n" +
                "無駄ばかり 下らない日々<br>\n" +
                "無きゃ無いで なんか つまらない<br>\n" +
                "</span>\n" +
                "</p>";
    }
}
