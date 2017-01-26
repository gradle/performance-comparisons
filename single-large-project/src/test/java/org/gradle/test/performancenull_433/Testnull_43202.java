package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43202 {
    private final Productionnull_43202 production = new Productionnull_43202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}