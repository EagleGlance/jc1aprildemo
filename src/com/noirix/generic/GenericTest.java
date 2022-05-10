package com.noirix.generic;

import com.noirix.domain.Cat;

import java.util.Optional;

//Shift + F6 - рефактроринг
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

        //Ctrl+D - копирование строки
        //Ctrl+Z - отмена действия
        //Ctrl+W - выделение слова и строки поэтапно
        //Ctrl+W - выделение слова и строки поэтапно
        //Alt + тянуть курсор - множественное выделение строк
        //Alt + Shift - множественное выделение строк
        //Ctrl + Shift + F - поиск по файлам внутри текста файла
        //Ctrl + N - поиск по названиям класов
        //Ctrl + P - демонстрация параметров метода/методов
        //Ctrl + Alt + стрелки влево/вправо
        //Ctrl + Shift + стрелка вверх/вниз
        //Ctrl + Shift + V - открыть буфер обмена и выбрать элементы из него

        String[] ss = new String[]{"asdasd", "asdasd"};
        for (String s1 : ss) {

        }

        if (cat1.isPresent()) {
            System.out.println(cat1.get());
        }
    }
}
