package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43292 {
    private final Productionnull_43292 production = new Productionnull_43292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}