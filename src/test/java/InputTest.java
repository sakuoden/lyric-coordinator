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
}
