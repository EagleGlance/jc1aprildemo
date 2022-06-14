package com.noirix.domain;

import com.noirix.reflection.CustomAnnotation;
import com.noirix.reflection.SecondCustomAnnotation;

import java.util.Objects;

@CustomAnnotation
@SecondCustomAnnotation
public class Cat extends Animal implements Comparable<Cat> {

    public static int count = 0;

    //Предпкомпилиуемая константа
    public static final String CONSTANT_WITH_UNDERSCORE = "cat";

    //Константа класса
    @CustomAnnotation
    private final int constantNumber = 10;

    private String id; // Long/String/primitive type of unique identifier for object for search this object

    /*Поля класса = характеристики*/
    private String catName = "Default Cat";

    private double weight = 3;

    private String color = "Black";

    private Gender gender = Gender.NOT_SELECTED;

    /*Конструктор по умолчанию*/
    public Cat() {
        System.out.println("In Cat Default constructor");
    }

    /*Перегрузка контруктора*/
    public Cat(String catName, double weight, String color) {
        super();
        System.out.println("In Cat constructor with params");
        this.catName = catName;
        this.weight = weight;
        this.color = color;
    }

    public Cat(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(String catName, double weight) {
        this.catName = catName;
        this.weight = weight;
    }

    /*Getter/Setter
    Alt+Insert and choose Getter/Setter, after that choose fields for generating methods*/

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    @SecondCustomAnnotation
    public String getCatName() {
        return catName;
    }

    /*this - ссылка на самого себя, на текущий объект при использовании*/
    public void setCatName(String catName) {
        this.catName = catName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*Методы класса = поведение класса*/
    public static void someLogic() {
        System.out.println("Some logic");
    }

    @Override
    public void process() {
        System.out.println("Process realization inside Cat");
    }

    public void process(String s, String p) {
        System.out.println(s.toUpperCase() + s.toLowerCase());
    }

    //Ctrl + Alt + O - import optimization
    //Ctrl + Alt + L - code formatting
    //Method signature = name of method + params + ordering of params + type of params
    public int sumOfTwoElements(int a, int b) {
        return a + b;
    }

    public synchronized double sumOfTwoElements(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    @Override
    public int compareTo(Cat o) {
        return this.catName.compareToIgnoreCase(o.getCatName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return constantNumber == cat.constantNumber && Double.compare(cat.weight, weight) == 0 && Objects.equals(id, cat.id) && Objects.equals(catName, cat.catName) && Objects.equals(color, cat.color) && gender == cat.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), constantNumber, id, catName, weight, color, gender);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "constantNumber=" + constantNumber +
                ", id='" + id + '\'' +
                ", catName='" + catName + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                "} " + super.toString();
    }
}
