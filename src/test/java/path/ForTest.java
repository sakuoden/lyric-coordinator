package path;

import java.nio.file.Paths;

public class ForTest {
    public static String fileAbsolutePath() {
        java.nio.file.Path path = Paths.get("src","test", "resources", "jack-the-newest", "なんか.txt");
        return path.toString();
    }

    public static String invalidFileAbsolutePath() {
        java.nio.file.Path path = Paths.get("src","test", "resources", "jack-the-newest", "なんか.pdf");
        return path.toString();
    }
}
