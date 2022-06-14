package com.noirix.io;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextIOOperations {
    public static final String READ_CONTENT_FILE = "read.txt";
    public static final String WRITE_CONTENT_FILE = "output.txt";

    public static void main(String[] args) {
        //1. Read from file read.txt
        //2. Process string and make it in UPPER CASE format
        //3. Write result string to output.txt

        int bufferSize = writeTestDataToFile();

        readProcessAndReWriteToFile(bufferSize);
    }

    public static int writeTestDataToFile() {
        String usersText = RandomStringUtils.randomAlphabetic(10);

        try (FileWriter fileWriter = new FileWriter(READ_CONTENT_FILE);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            printWriter.print(usersText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return usersText.length();
    }

    public static void readProcessAndReWriteToFile(int bufferSize) {
        try (FileWriter fileWriter = new FileWriter(WRITE_CONTENT_FILE);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

             PrintWriter printWriter = new PrintWriter(bufferedWriter);

             FileReader fileReader = new FileReader(READ_CONTENT_FILE)) {

            char[] buffer = new char[bufferSize];

            /*Read file*/
            int read = fileReader.read(buffer);
            System.out.println("Size of file is: " + read + " bytes");

            /*Process content*/
            String content = new String(buffer);
            String updatedContent = content.toUpperCase();

            /*Write updated content to file*/
            printWriter.print(updatedContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
