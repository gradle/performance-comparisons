package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33292 {
    private final Productionnull_33292 production = new Productionnull_33292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}