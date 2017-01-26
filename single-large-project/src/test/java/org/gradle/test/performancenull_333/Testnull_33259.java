package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33259 {
    private final Productionnull_33259 production = new Productionnull_33259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}