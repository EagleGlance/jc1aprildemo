package com.noirix.collections;

import com.noirix.domain.Cat;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        cat1.setCatName("asdfdsfdsf");
        Cat cat2 = new Cat();
        cat2.setCatName("sdfsdf");

        Set<Cat> set = new TreeSet<>(); //unique objects inside set
        set.add(cat);
        set.add(cat1);
        set.add(cat2);

        for (Cat tempCat : set) {
            System.out.println(tempCat);
        }
    }
}
