package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43279 {
    private final Productionnull_43279 production = new Productionnull_43279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}