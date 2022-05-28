package com.noirix.streamlambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        CustomFunctionalInterface sum = (a, b) -> a + b;
        CustomFunctionalInterface multiplication = (a, b) -> a * b;

        Integer sumResult = sum.proceed(10, 20);
        Integer multiplicationResult = multiplication.proceed(10, 20);

        System.out.println(sumResult);
        System.out.println(multiplicationResult);

        CustomInterfaceImpl customInterface = new CustomInterfaceImpl();
        Integer proceed = customInterface.proceed(10, 20);
        System.out.println(proceed);

        process(100, sum);
        process(100, multiplication);

        Consumer<String> consumer = (s) -> System.out.println(s.toLowerCase() + s.toUpperCase());
        consumer.accept("asdasda");

        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + i);
        biConsumer.accept("asdfdsf", 100);

        //Function<String, String> stringFunction = (s) -> s.toUpperCase();
        Function<String, String> stringFunction = String::toUpperCase; //method reference
        String apply = stringFunction.apply("fghjkl;");
        System.out.println(apply);

        BiFunction<String, Integer, String> biFunction = (s, i) -> s.toUpperCase() + i;
        String testBiFunction = biFunction.apply("asdasd", 100);
        System.out.println(testBiFunction);

        Predicate<String> customIsNotBlank = (s) -> !s.isBlank();

        if (customIsNotBlank.test("asdfsdfsdf")) {
            System.out.println("some logic");
        }
    }

    public static void process(Integer a, CustomFunctionalInterface i) {
        System.out.println(i.proceed(a, a));
    }
}
