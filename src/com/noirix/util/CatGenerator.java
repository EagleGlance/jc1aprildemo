package com.noirix.util;

import com.noirix.domain.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatGenerator {

    public static List<Cat> generateCats(int objectsCount) {

        List<Cat> cats = new ArrayList<>(objectsCount);

        for (int i = 0; i < objectsCount; i++) {
            //add generate method for different params of object
            //cats.add(new Cat(generateName(), generateWeight(), generateColor()));
        }

        return cats;
    }
}
