import domain.file.File;
import service.FileReadService;
import org.junit.jupiter.api.Test;
import path.ForTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InputTest {
    @Test
    void getFileExtensionTest() {
        File file = File.from(ForTest.fileAbsolutePath());
        assertEquals("txt", file.extension());
    }

    @Test
    void confirmFileTypeTest() {
        File testFile = File.from(ForTest.fileAbsolutePath());
        assertTrue(testFile.isValid());

        File invalidFile = File.from(ForTest.invalidFileAbsolutePath());
        assertFalse(invalidFile.isValid());
    }

    @Test
    void toStringTest() {
        FileReadService fileReadService = FileReadService.from(ForTest.fileAbsolutePath());
        assertEquals(expected(), fileReadService.toString());
    }

    private String expected() {
        return "「友達」つっても おもろない\n" +
                "と思えば簡単にお断り\n" +
                "言葉に出すほどでも無い\n" +
                "ただ、どこかのデータ バインド代わりに\n" +
                "人間嫌いで進展しないのに\n" +
                "地元の顔は新鮮じゃない\n" +
                "普通な思い出をヴィンテージみたく\n" +
                "飾る作品展示会\n" +
                "二十歳掲げた ダサい名前が\n" +
                "優先順位の一番目だ\n" +
                "もしも俺が一人だったら\n" +
                "続かず あの日の昨日以下\n" +
                "どこかの肩書興味ない\n" +
                "自分の言葉は飾らない\n" +
                "お前に嫌われたって構わない\n" +
                "立石に俺の仲間がいる\n" +
                "\n" +
                "言葉にするのは そりゃ簡単\n" +
                "けど軽々しいのは違和感が\n" +
                "ただ、他に表す術も無いな\n" +
                "説明できないけど なんか\n" +
                "ずっと友達 なんて言わない\n" +
                "無きゃ無いで なんか つまらない\n" +
                "無駄ばかり 下らない日々\n" +
                "無きゃ無いで なんか つまらない\n" +
                "\n" +
                "替えがいない存在 なんてない\n" +
                "いなくても平気 誰だってさ\n" +
                "何を愛し何を大事にしても一緒\n" +
                "それら全て含めて\n" +
                "もしも一つ残らず記憶ごと削除\n" +
                "したならば何事もなく\n" +
                "揚々と違う人生を\n" +
                "違和感なく生きてくだろう\n" +
                "ただ、たまたま会って また関わって\n" +
                "それが重なって なんか仲間って\n" +
                "なってたけど 全て偶然\n" +
                "でも過ぎ去れば全て必然\n" +
                "そう俺が今意味付ける\n" +
                "いや意味付けたい想いに気づける\n" +
                "他の道もあった\n" +
                "でもお前らで良かった\n" +
                "\n" +
                "言葉にするのは そりゃ簡単\n" +
                "けど軽々しいのは違和感が\n" +
                "ただ他に表す術も無いな\n" +
                "説明できないけど なんか\n" +
                "ずっと友達 なんて言わない\n" +
                "無きゃ無いで なんか つまらない\n" +
                "無駄ばかり 下らない日々\n" +
                "無きゃ無いで なんか つまらない\n" +
                "\n" +
                "出会いと別れ 繰り返し\n" +
                "とめどなく 流れてく毎日\n" +
                "そりゃ色んな奴がいた\n" +
                "もちろん今も、そんなもんさ\n" +
                "頭で考えるほど分からなくなる\n" +
                "自問自答で探し出すパズル\n" +
                "何かに当てはめれば安く\n" +
                "雑な違和感を胸に隠す\n" +
                "そんな中 当たり前にいた仲間\n" +
                "意識して気づけたバカだが\n" +
                "背中押してくれてることは確か\n" +
                "おかげで進めそうさ明日\n" +
                "特別な理由？と聞かれちゃ 無い\n" +
                "でもまたこうして皆で笑い\n" +
                "想い募らせて描いたリリック\n" +
                "俺が思う特別な意味\n" +
                "言葉にするのは そりゃ簡単\n" +
                "けど軽々しいのは違和感が\n" +
                "ただ他に表す術も無いな\n" +
                "説明できないけど なんか\n" +
                "ずっと友達 なんて言わない\n" +
                "無きゃ無いで なんか つまらない\n" +
                "無駄ばかり 下らない日々\n" +
                "無きゃ無いで なんか つまらない";
    }
}
