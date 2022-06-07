package com.noirix.string_example;

public class StringTest {
    public static final String hello = "Hello";

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString(); //Hello

        String s3 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String hello = "Hello";
        String lo = "lo";

        System.out.println(hello == "Hello");
        System.out.println(Outer.hello == hello);
        System.out.println(hello == ("Hel" + "lo"));
        System.out.println(hello == ("He" + "l" + "l" + "o"));
        System.out.println(hello == ("Hel" + lo));
        System.out.println(hello == ("Hel" + lo).intern());

    }
}

class Outer {
    static String hello = "Hello";
}
