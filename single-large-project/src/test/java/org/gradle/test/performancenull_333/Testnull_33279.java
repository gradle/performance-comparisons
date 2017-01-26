package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33279 {
    private final Productionnull_33279 production = new Productionnull_33279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}