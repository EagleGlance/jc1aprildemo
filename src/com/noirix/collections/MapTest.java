package com.noirix.collections;

import com.noirix.domain.Cat;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, Cat> map = new HashMap<>();

        //Ctrl + Shift + U
        String barsik = "Barsik";
        String tigr = "Tigr";
        String senya = "Senya";
        String senya1 = "Senya1";

        map.put(barsik, new Cat());
        map.put(tigr, new Cat());
        map.put(senya, new Cat());
        map.put(senya1, new Cat());
        map.put(senya1, new Cat("asdasd", 8d, "c"));
        map.put(null, new Cat());

        //System.out.println(map.remove(tigr));
        //System.out.println(map.remove(tigr));

        System.out.println(map.get(senya1));
        System.out.println(map.get("sdfsdfsdfsd"));

        for (Map.Entry<String, Cat> stringCatEntry : map.entrySet()) {
            System.out.println(stringCatEntry.getKey() + ": " + stringCatEntry.getValue());
        }

    }
}
