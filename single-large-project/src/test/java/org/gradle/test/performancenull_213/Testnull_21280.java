package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21280 {
    private final Productionnull_21280 production = new Productionnull_21280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}