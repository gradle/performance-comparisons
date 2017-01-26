package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33224 {
    private final Productionnull_33224 production = new Productionnull_33224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}