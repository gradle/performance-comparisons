package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43493 {
    private final Productionnull_43493 production = new Productionnull_43493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}