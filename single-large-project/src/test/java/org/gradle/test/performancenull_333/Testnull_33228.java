package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33228 {
    private final Productionnull_33228 production = new Productionnull_33228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}