package com.noirix.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class StreamFilesTest {
    public static void main(String[] args) throws IOException {
        final Path file = Paths.get("myfile.txt");

        for (int i = 0; i < 100; i++) {
            Files.write(
                    file,
                    "the text\n".getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        }

        Files.readAllLines(file).forEach(System.out::println);

        System.out.println(Files.readAllBytes(file).length);
    }
}
