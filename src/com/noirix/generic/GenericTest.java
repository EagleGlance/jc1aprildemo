package com.noirix.generic;

import com.noirix.domain.Cat;

import java.util.Optional;

public class GenericTest {
    public static void main(String[] args) {
        TemplateObject<Long, String> obj = new TemplateObject<>(100L, "Value"); //<> - diamond operator
        TemplateObject<Double, String> obj1 = new TemplateObject<>(); //<> - diamond operator

        System.out.println(obj.getKey());
        System.out.println(obj.getValue());

        Cat cat = new Cat();
        Optional<Cat> cat1 = Optional.ofNullable(cat);

        System.out.println(cat1.isPresent());
        System.out.println(cat1.isEmpty());

        if (cat1.isPresent()) {
            System.out.println(cat1.get());
        }
    }
}
