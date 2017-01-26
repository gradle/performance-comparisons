package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33280 {
    private final Productionnull_33280 production = new Productionnull_33280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}