package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43224 {
    private final Productionnull_43224 production = new Productionnull_43224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}