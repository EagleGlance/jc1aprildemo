package com.noirix.domain;

public enum Gender implements CustomInterface, AnotherOneInterface {
    MALE("a"), FEMALE("b"), NOT_SELECTED("c");

    private String someInfo;

    Gender(String someInfo) {
        this.someInfo = someInfo;
    }

    public String getSomeInfo() {
        return someInfo;
    }

    @Override
    public String getSomeString() {
        return null;
    }

    @Override
    public void someFunctionality() {
        System.out.println("Some functionality inside interface");
    }

    @Override
    public Cat generateCat() {
        return null;
    }
}
