package com.noirix;

import com.noirix.domain.AnotherOneInterface;
import com.noirix.domain.CustomInterface;
import com.noirix.service.MathService;

public class InterfacesTest {
    public static void main(String[] args) {
        MathService mathService = new MathService();

        CustomInterface service = new MathService();
        AnotherOneInterface service1 = new MathService();

        mathService.someFunctionality();
        mathService.generateCat();
        mathService.getSomeString();

        service.generateCat();
        service.someFunctionality();

        service1.getSomeString();
    }
}
