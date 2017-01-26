package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33296 {
    private final Productionnull_33296 production = new Productionnull_33296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}