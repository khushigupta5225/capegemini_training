package junitPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.nio.file.*;

public class FileProcessorTest {

    @Test
    void fileTest() throws Exception {
        FileProcessor f = new FileProcessor();
        f.write("a.txt", "Hello");

        assertEquals("Hello", f.read("a.txt"));
        Files.deleteIfExists(Paths.get("a.txt"));
    }
}
