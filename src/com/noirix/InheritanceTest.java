package com.noirix;

import com.noirix.domain.Animal;
import com.noirix.domain.Cat;
import com.noirix.domain.Dog;

public class InheritanceTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal cat1 = new Cat();
        Animal dog = new Dog();
        Dog dog1 = new Dog();
        Animal animal = new Animal();

        System.out.println("Result of work: ");
        cat.process();
        cat1.process();
        dog.process();
        dog1.process();
        animal.process();
    }
}
