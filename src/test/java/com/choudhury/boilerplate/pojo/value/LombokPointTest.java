package com.choudhury.boilerplate.pojo.value;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class LombokPointTest {

    @DisplayName("Test Pojo")
    @Test
    void testPojo(){
        LombokPoint underTest = new LombokPoint(123.45d, 987.65d);

        // debugging underTest.getX() will not take to Java Source (method only exists in bytecode)
        double x = underTest.getX();
        System.out.println("X ="+ x);
        System.out.println("Y="+underTest.getY());
        System.out.println(underTest);

        LombokPoint secondValue = new LombokPoint(123.45d, 987.65d);
        Assertions.assertTrue(underTest.equals(secondValue),"Both Points should be equal");

    }
}