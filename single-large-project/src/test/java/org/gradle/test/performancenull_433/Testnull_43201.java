package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43201 {
    private final Productionnull_43201 production = new Productionnull_43201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}