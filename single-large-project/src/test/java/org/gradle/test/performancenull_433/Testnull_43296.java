package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43296 {
    private final Productionnull_43296 production = new Productionnull_43296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}