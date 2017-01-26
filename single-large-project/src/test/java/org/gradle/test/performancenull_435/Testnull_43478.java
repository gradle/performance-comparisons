package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43478 {
    private final Productionnull_43478 production = new Productionnull_43478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}