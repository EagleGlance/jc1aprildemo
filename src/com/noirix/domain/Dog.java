package com.noirix.domain;

public class Dog extends Animal {

    @Override
    public void process() {
        System.out.println("Process realization inside Dog");
    }

    public void process(Integer s, String p) {
        System.out.println(s + p.toLowerCase());
    }
}
