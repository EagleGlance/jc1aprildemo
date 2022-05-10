package com.noirix.domain;

import com.noirix.exception.EntityNotFoundException;

public class Dog extends Animal {

    @Override
    public void process() {
        System.out.println("Some process inside Dog class");
        throw new EntityNotFoundException(707);
    }

    public void process(Integer s, String p) {

    }
}
