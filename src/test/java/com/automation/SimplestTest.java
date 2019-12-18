package com.automation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimplestTest {


    @Test
    public void calculationDevideTest(){

        double a = 10;
        double b = 2;

        double result = b/a;

        assertEquals(result, 0.2, "Count again");

    }
    @Test
    public void calculationMultiplicationTest(){

        double a = 3;
        double b = 4;

        double result = b*a;

        assertEquals(result, 12.0, "Count again");

    }
}
