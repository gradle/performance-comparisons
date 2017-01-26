package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43233 {
    private final Productionnull_43233 production = new Productionnull_43233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}