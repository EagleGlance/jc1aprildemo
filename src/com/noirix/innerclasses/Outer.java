package com.noirix.innerclasses;

import com.noirix.domain.AnotherOneInterface;
import com.noirix.domain.Cat;

public class Outer {

    private static float someVar = 10;

    private String info = "Default String";

    private int counter = 0;

    private Nested nested;

    public Outer(String info, int counter) {
        this.info = info;
        this.counter = counter;
        nested = new Nested(info);
    }

    static class Nested {
        private String nestedString;

        public Nested(String nestedString) {
            this.nestedString = nestedString;
        }

        public void nestedProcess() {
            Outer outer = new Outer("sdefdsf", 100);
            System.out.println(outer.counter);
            System.out.println(outer.info);
            System.out.println(someVar);
        }

        public static void printString(String s) {
            System.out.println(s.toUpperCase());
        }
    }

    final class Inner extends Cat implements AnotherOneInterface {

        public static final String INNER_CONSTANT = "inner constant";

        private String innerString;

        private int innerCounter;

        public Inner(String innerString, int innerCounter) {
            this.innerString = innerString;
            this.innerCounter = innerCounter;
        }

        public void process() {
            System.out.println(counter);
            System.out.println(info);
            System.out.println(someVar);
        }

        public String getInnerString() {
            return innerString;
        }

        public void setInnerString(String innerString) {
            this.innerString = innerString;
        }

        public int getInnerCounter() {
            return innerCounter;
        }

        public void setInnerCounter(int innerCounter) {
            this.innerCounter = innerCounter;
        }

        @Override
        public String getSomeString() {
            return null;
        }
    }

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    public static float getSomeVar() {
        return someVar;
    }

    public static void setSomeVar(float someVar) {
        Outer.someVar = someVar;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}

class AnotherOneOuterClass {

}
