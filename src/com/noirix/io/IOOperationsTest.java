package com.noirix.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOOperationsTest {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("Some random string1123123123");

            printWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
