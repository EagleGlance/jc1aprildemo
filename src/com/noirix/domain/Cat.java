package com.noirix.domain;

import java.util.Objects;

/*Класс - шаблон создания объекта*/
public class Cat {
    {
        System.out.println("First logic block");
        weight = 888;
    }

    public static int count = 0;

    //Предпкомпилиуемая константа
    public static final String CONSTANT_WITH_UNDERSCORE;

    //Константа класса
    private final int constantNumber;

    /*Поля класса = характеристики*/
    private String catName = "Default Cat";

    private double weight = 3;

    static {
        CONSTANT_WITH_UNDERSCORE = "CAT";
        System.out.println("First static block");
        count = 100;
    }

    {
        System.out.println("Second logic block");
        weight = 100;
    }

    private String color = "Black";

    /*Конструктор по умолчанию*/
    public Cat() {
        System.out.println("Default constructor");
        constantNumber = 10;
    }

    /*Перегрузка контруктора*/
    public Cat(String catName, double weight, String color) {
        this.catName = catName;
        this.weight = weight;
        this.color = color;
        constantNumber = 10;
    }

    public Cat(double weight, String color) {
        this.weight = weight;
        this.color = color;
        constantNumber = 10;
    }

    public Cat(String catName, double weight) {
        this.catName = catName;
        this.weight = weight;
        constantNumber = 10;
    }

    /*Getter/Setter
    Alt+Insert and choose Getter/Setter, after that choose fields for generating methods*/

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public String getCatName() {
        return catName;
    }

    /*this - ссылка на самого себя, на текущий объект при использовании*/
    public void setCatName(String catName) {
        this.catName = catName;
    }

    {
        System.out.println("Third logic block");
        weight = 999;
    }

    static {
        System.out.println("Second static block");
        count = 888;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //Приведение типа одного объекта к другому
        Cat cat = (Cat) o;

        if (Double.compare(cat.weight, weight) != 0) return false;
        if (catName != null ? !catName.equals(cat.catName) : cat.catName != null) return false;
        return color != null ? color.equals(cat.color) : cat.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = catName != null ? catName.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    //Ctrl + Alt + O - import optimization
    //Ctrl + Alt + L - code formatting
    //Method signature = name of method + params + ordering of params + type of params
    public int sumOfTwoElements(int a, int b) {
        return a + b;
    }

    public double sumOfTwoElements(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }


}
