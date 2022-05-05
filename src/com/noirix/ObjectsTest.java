package com.noirix;

import com.noirix.domain.Cat;

public class ObjectsTest {
    public static void main(String[] args) {
        /*Объект = экземпляр класса*/
        Cat cat = new Cat();
        Cat cat4 = new Cat();

        System.out.println(cat.hashCode());
        System.out.println(cat4.hashCode());

        Cat cat1 = new Cat("Barsik", 5, "brown");
        Cat cat2 = new Cat(5, "brown");
        Cat cat3 = new Cat( "Flash", 4);

        int result = cat.sumOfTwoElements(5, 6);
        double resultOverloadedMethod = cat.sumOfTwoElements("5", "6");
        System.out.println(cat.sumOfTwoElements(5, 6));
        System.out.println(result);
        System.out.println(resultOverloadedMethod);
        Cat.someLogic();

        System.out.println("Cat Info: ");
        System.out.println(cat.getCatName());
        System.out.println(cat.getColor());
        System.out.println(cat.getWeight());
        cat.setCatName("Slava");
        System.out.println(cat.getCatName());

        System.out.println("Cat1 Info: ");
        System.out.println(cat1.getCatName());
        System.out.println(cat1.getColor());
        System.out.println(cat1.getWeight());

        System.out.println(cat1.getClass());

        System.out.println(cat1.hashCode());

        System.out.println(cat.equals(cat1));
        System.out.println(cat.equals(null));
        System.out.println(cat.equals(new Object()));

        System.out.println(cat);
        System.out.println(cat4);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

    }
}
