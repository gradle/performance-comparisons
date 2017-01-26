package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27430 {
    private final Productionnull_27430 production = new Productionnull_27430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}