package com.noirix.innerclasses;

import java.util.Date;

public class InnerClassesTest {
    public static void main(String[] args) {
        Outer outer = new Outer("qweqwe", 100);
        Outer.Inner inner = outer.new Inner("sdfsdf", 100);

        System.out.println(inner.getInnerCounter());
        System.out.println(inner.getInnerString());
        System.out.println(inner.getSomeString());
        inner.process();
        System.out.println(Outer.Inner.INNER_CONSTANT);

        Outer.Nested.printString("asdasd");

        Outer.Nested nested = outer.getNested();
        nested.nestedProcess();

        Date date = new Date() {
            @Override
            public String toString() {
                return "Ho ho ho";
            }
        };

        Date date2 = new Date() {
            @Override
            public String toString() {
                return "Ho ho ho";
            }
        };

        System.out.println(date);
        System.out.println(date2);
        System.out.println(new Date());

    }
}
