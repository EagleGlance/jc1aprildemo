package com.noirix.string_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpTest {
    public static void main(String[] args) throws IOException {
        final Path file = Paths.get("myfile.txt");
        final String emailValidationRegexp = "([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})";
        String collect = String.join("", Files.readAllLines(file));

        Pattern compile = Pattern.compile(emailValidationRegexp);
        Matcher matcher = compile.matcher(collect);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
