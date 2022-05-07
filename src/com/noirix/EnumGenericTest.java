package com.noirix;

import com.noirix.domain.Gender;

public class EnumGenericTest {
    public static void main(String[] args) {
        System.out.println(Gender.FEMALE);
        System.out.println(Gender.FEMALE.name());
        System.out.println(Gender.FEMALE.ordinal());
        System.out.println(Gender.FEMALE.getSomeInfo());
        Gender.FEMALE.someFunctionality();

        System.out.println(Gender.NOT_SELECTED);
        System.out.println(Gender.NOT_SELECTED.name());
        System.out.println(Gender.NOT_SELECTED.ordinal());
        System.out.println(Gender.NOT_SELECTED.getSomeInfo());

        System.out.println(Gender.MALE);
        System.out.println(Gender.MALE.name());
        System.out.println(Gender.MALE.ordinal());
        System.out.println(Gender.MALE.getSomeInfo());

        Gender male = Gender.valueOf("male".toUpperCase());
        System.out.println(male);

        Gender[] enumConstants = Gender.values();
        for (Gender enumConstant : enumConstants) {
            System.out.println(enumConstant);
        }

        Gender genderForSwitch = Gender.NOT_SELECTED;

        switch (genderForSwitch) {
            case MALE:
                System.out.println("some male logic");
                break;
            case FEMALE:
                System.out.println("some female logic");
                break;
            case NOT_SELECTED:
            default:
                System.out.println("default case");
                break;
        }
    }
}
