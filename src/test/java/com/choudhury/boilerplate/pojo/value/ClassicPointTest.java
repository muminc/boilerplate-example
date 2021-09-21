package com.choudhury.boilerplate.pojo.value;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClassicPointTest {

    @DisplayName("Test Pojo")
    @Test
    void testPojo(){
        ClassicPoint underTest = new ClassicPoint(123.45d, 987.65d);

        // debugging underTest.getX() will take to the source
        //  you'll get different behaviour for lombok and record equivalent
        double x = underTest.getX();
        System.out.println("X ="+ x);
        System.out.println("Y="+underTest.getY());
        System.out.println(underTest);

        ClassicPoint secondValue = new ClassicPoint(123.45d, 987.65d);
        Assertions.assertTrue(underTest.equals(secondValue),"Both Points should be equal");

    }

}