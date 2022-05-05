package com.noirix.domain;

import java.util.Objects;

public class Animal {
    private String animalName;

    public Animal() {
        System.out.println("In default Animal constructor");
    }

    public Animal(String animalName) {
        System.out.println("In Animal constructor with params");
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void process() {
        System.out.println("Process realization inside Animal");
    }

    public void process(String s) {
        System.out.println(s.toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
