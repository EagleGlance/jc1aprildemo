package com.noirix.string_example;

import java.util.Formatter;
import java.util.Locale;

public class StringMethodsTest {
    public static void main(String[] args) {
//        String test = "Test string aaa bbb;";
//        String stringForTrim = "    dfghjkl   ";
//
//        System.out.println(test.toUpperCase());
//        System.out.println(test.toLowerCase());
//        System.out.println(test.indexOf("a"));
//        System.out.println(test.indexOf("a", 10));
//        System.out.println(test.lastIndexOf("a", 10));
//        System.out.println(test.lastIndexOf("a"));
//        System.out.println(test.replace("aaa", "nnn"));
//        System.out.println(test.replace('a', 'n'));
//        System.out.println(test.contains("asdasdas"));
//        System.out.println(test.contains("string"));
//
//        System.out.println(stringForTrim);
//        System.out.println(stringForTrim.trim());
//        System.out.println(stringForTrim.trim().substring(1));
//
//        String s = new StringBuilder()
//                .append("aabbcc1")
//                .append("aabbcc2")
//                .append("aabbcc3")
//                .append("aabbcc4")
//                .append("aabbcc5")
//                .append("aabbcc6")
//                .toString();
//
//        String sb = new StringBuffer()
//                .append("aabbcc1")
//                .append("aabbcc2")
//                .append("aabbcc3")
//                .append("aabbcc4")
//                .append("aabbcc5")
//                .append("aabbcc6").toString();
//
//        System.out.println(s);
//        System.out.println(sb);


        System.out.printf("%e", 10000000000000F);
        System.out.println();
        System.out.printf("%f", 100F);
        System.out.println();
        System.out.printf("%g", 10000000000000F);
        System.out.println();
        //System.out.printf("%o", 28999);
        System.out.printf("%x \n", 289999223);

        System.out.printf("1. %s   : %e : %s\n", "Argument", 1230000F, "Argument");

        Formatter formatter = new Formatter();
        int i = 345;
        double d = 17.36534599997;

        System.out.println("Formatter example");
        formatter.format("- %-7dok%n", i);
        formatter.format("- %-7dok%n", i);
        formatter.format("- % 7dok%n", i);
        formatter.format("- %07dok%n", i);
        formatter.format("- %#fok%n", d);
        formatter.format("- %.1fok%n", d);
        System.out.println(formatter);
    }
}
