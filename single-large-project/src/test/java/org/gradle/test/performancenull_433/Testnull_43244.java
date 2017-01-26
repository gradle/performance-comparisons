package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43244 {
    private final Productionnull_43244 production = new Productionnull_43244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}