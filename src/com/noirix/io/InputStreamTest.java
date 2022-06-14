package com.noirix.io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) {


//        byte[] bytes = new byte[]{100, 65, 17};
        byte[] buffer = new byte[100];

//        InputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try (FileInputStream fileInputStream = new FileInputStream("text.txt")) {
            int read = fileInputStream.read(buffer);
            System.out.println(read);
            System.out.println(new String(buffer));
//            int read = byteArrayInputStream.read();
//            System.out.println(read);
//            byteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
