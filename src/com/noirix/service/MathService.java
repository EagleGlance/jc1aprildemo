package com.noirix.service;

import com.noirix.domain.AnotherOneInterface;
import com.noirix.domain.Cat;
import com.noirix.domain.CustomInterface;

public class MathService implements CustomInterface, AnotherOneInterface {

    @Override
    public void someFunctionality() {
        System.out.println("Some Functionality");
    }

    @Override
    public Cat generateCat() {
        return new Cat();
    }

    @Override
    public String getSomeString() {
        return "SomeString";
    }
    /*some functionality*/
}
