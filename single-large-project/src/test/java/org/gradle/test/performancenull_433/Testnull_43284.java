package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43284 {
    private final Productionnull_43284 production = new Productionnull_43284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}