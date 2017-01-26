package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43276 {
    private final Productionnull_43276 production = new Productionnull_43276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}