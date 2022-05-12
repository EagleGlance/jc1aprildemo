package com.noirix.collections;

import com.noirix.domain.Cat;
import com.noirix.util.CatUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {

    public static void main(String[] args) {


        Cat cat = new Cat();

        long start = System.currentTimeMillis();

        List<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat);
        cats.add(cat);
        cats.add(cat);
        cats.add(cat);
        cats.add(cat);

        long end = System.currentTimeMillis();

        System.out.println(cats.get(1));
        System.out.println(cats.remove(new Cat()));


        long result = end - start;

        System.out.println("Array list process: " + result);

        List<Cat> cats1 = cats.subList(1, 4);
        //cats.clear();
        //System.out.println(cats.get(10));

        //print all elements of collection
        CatUtil.printCollection(cats);
        CatUtil.printCollection(cats1);
        CatUtil.printCollectionInfo(cats);
        CatUtil.printCollectionInfo(cats1);


        List<Cat> linkedCats = new LinkedList<>();

        linkedCats.add(cat);
        linkedCats.add(cat);
        linkedCats.add(cat);
        linkedCats.add(cat);
        linkedCats.add(cat);

        System.out.println(linkedCats.get(1));
        System.out.println(linkedCats.remove(new Cat()));

        List<Cat> cats2 = cats.subList(1, 4);
        //cats.clear();
        //System.out.println(cats.get(10));

        //print all elements of collection
        CatUtil.printCollection(linkedCats);
        CatUtil.printCollection(cats2);
        CatUtil.printCollectionInfo(linkedCats);
        CatUtil.printCollectionInfo(cats2);


    }
}
