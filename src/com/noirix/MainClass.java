/*This class was created for some secret purposes:)*/
//Simple comment
package com.noirix;

/*imports*/

/*CamelCase*/

public class MainClass {
    /*psvm = public static void main*/
    public static void main(String[] args) {
//        /*Способ отображения информации про работе приложения*/
//        System.out.println("Hello world!");
//
//        long defaultParamForSum = 1_000_000L;
//        char startSymbolForSearch = '\n';
//        double d = 10D;
//        boolean b = true;
//
//        System.out.println(defaultParamForSum);
//        System.out.println(b);
//        System.out.println(startSymbolForSearch);
//        System.out.println(d);
//
//        int test = 10;
//
//        System.out.println(d / 5);
//        System.out.println(13 % 5);
//
//        /*Arithmetic operators*/
//        test = test + 1;
//        test++;
//        test += 10;
//        test *= 10;
//        test /= 10;
//        System.out.println(test++);
//        System.out.println(++test);
//
//        /*Logic operators*/
//
////        if () {
////
////        }
//
//        System.out.println("Result of working logic operators");
//        System.out.print("> :");
//        System.out.println(10 > 5);
//        System.out.print(">= :");
//        System.out.println(10 >= 5);
//        System.out.print("<= :");
//        System.out.println(10 <= 5);
//        System.out.print("< :");
//        System.out.println(10 < 5);
//        System.out.print("!= :");
//        System.out.println(10 != 5);
//        System.out.print("== :");
//        System.out.println(10 == 5);
//
//
//        /*0000000000000000000000000000100*/
//        /*0000000000000000000000000001000*/
//        int testByteOperators = 4;
//        testByteOperators <<= 1;
//
//        /*1111111111111111111111111111111*/
//        /*0000000000111111111111111111111*/
//        int testByte = -1;
//        testByte >>>= 10;
//
//        System.out.println(testByte);
//        System.out.println(testByteOperators);
//
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && false);
//        System.out.println(false && true);
//
//        if (10 > 5) {
//            System.out.println("10 greater than 5");
//        } else {
//            System.out.println("5 greater than 10");
//        }
//
//        if (testByteOperators > testByte || 10 > 5) {
//            System.out.println("First param is greater than second param");
//        }
//
//        System.out.println(10 > 5 ? "10 greater than 5" : "5 greater than 10");
//
//
//        /*Loops*/
//        /*F7-F8-F9 - debug buttons*/
//        boolean stopWhile = true;
//        int countDown = 10;

        /*1. While*/
        /*итерация = повторение выполнения кода*/
//        while (stopWhile) {
//            System.out.println("Yo ho ho!");
//            countDown--;
//            stopWhile = countDown != 0;
//        }

//        countDown = 10;
//        stopWhile = true;
        /*2. Do/While*/
//        do {
//            System.out.println("Yo ho ho!");
//            countDown--;
//            stopWhile = countDown != 0;
//        } while (stopWhile);

        /*3. For*/
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }

        /*Switch analog*/
//        if ("Mathew" == switchTest) {
//            System.out.println("Hello Mathew!");
//        } else {
//            if ("Slava" == switchTest) {
//                System.out.println("Hello Slava!");
//            } else {
//                System.out.println("we cannot catch some specific case :(");
//            }
//        }

        String switchTest = "Slava";

        switch (switchTest) {
            case "Mathew":
                System.out.println("Hello Mathew!");
                break;
            case "Slava":
                System.out.println("Hello Slava!");
                break;
            default:
                System.out.println("we cannot catch some specific case :(");
                break;
        }

        int a = 5;

        int[] dynamicArray = new int[] {1, 2, 5};

        for (int i : dynamicArray) {
            System.out.println(i);
        }

        int[] testArray = new int[10];
        testArray[0] = 100;
        testArray[1] = 777;

        //testArray[100] = 999;
        System.out.println(testArray.length);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }

        /*For-each loop*/
        for (int i : testArray) {
            System.out.println(i);
        }


        task1();
    }

    /*1. Weight on Moon*/
    public static void task1() {

    }
}