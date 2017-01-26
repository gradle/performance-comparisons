package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43298 {
    private final Productionnull_43298 production = new Productionnull_43298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}