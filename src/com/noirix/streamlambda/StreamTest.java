package com.noirix.streamlambda;

import com.noirix.domain.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        Predicate<Cat> catFilterByWeight = cat -> cat.getWeight() >= 1 && cat.getWeight() <= 3;
        UnaryOperator<Cat> catUpdater = cat -> {
            cat.setCatName(cat.getCatName().toUpperCase());
            cat.setColor("Mapped Color " + cat.getColor());
            return cat;
        };

        //Optional<Cat> first =
        //List<Cat> catsAfterProcessing =
        //Set<Cat> catsAfterProcessing =
        //Long result =
                cats.stream()
                .skip(2)
                .filter(catFilterByWeight)
                .map(catUpdater)
                .peek(Cat::toString)
                //.flatMap(cat -> Stream.of(cat.getCatName().split(" ")))
                //.mapToDouble(Cat::getWeight)
                .distinct()
                .limit(3)
                //.findFirst()
                //.findAny()
                //.collect(Collectors.toList())
                //.collect(Collectors.toSet())
                        //.collect(Collectors.joining(", "))
                        .forEach(System.out::println);
                ;


//        System.out.println(first.get());
//        //first.ifPresent(System.out::println);
//        if (first.isPresent()) {
//            System.out.println(first.get());
//        }

//        System.out.println(result);

//        for (Cat cat : catsAfterProcessing) {
//            System.out.println(cat);
//        }

//        List<String> objects = new ArrayList<>();
//        Stream<String> slava = objects.stream()
//                .filter(s -> s.toUpperCase().equals("SLAVA"))
//                .skip(10)
//                .skip(20)
//                .distinct()
//                .map(s -> s.toUpperCase() + s.toLowerCase())
//
//                ;
    }
}
