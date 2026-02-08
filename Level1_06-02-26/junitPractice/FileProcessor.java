package junitPractice;

import java.io.*;
import java.nio.file.*;

public class FileProcessor {

    public void write(String file, String text) throws IOException {
        Files.write(Paths.get(file), text.getBytes());
    }

    public String read(String file) throws IOException {
        return Files.readString(Paths.get(file));
    }
}

