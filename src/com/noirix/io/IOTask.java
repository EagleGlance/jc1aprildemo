package com.noirix.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOTask {
    public static void main(String[] args) {
        //1. Read from file read.txt
        //2. Process string and make it in UPPER CASE format
        //3. Write result string to output.txt

        String usersText = "Some text";//TODO: add to project commons lang for random string
        byte[] buffer = new byte[usersText.length()];

        try (FileOutputStream fileOutputStream = new FileOutputStream("read.txt")) {
            fileOutputStream.write(usersText.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        PipedOutputStream pipedOutputStream = new PipedOutputStream();
//        try {
//            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
//            pipedInputStream.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (FileInputStream fileInputStream = new FileInputStream("read.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            int read = fileInputStream.read(buffer);
            System.out.println("Size of file is: " + read + " bytes");

            String content = new String(buffer);
            String updatedContent = content.toUpperCase();

            fileOutputStream.write(updatedContent.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
