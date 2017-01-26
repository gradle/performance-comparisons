package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43236 {
    private final Productionnull_43236 production = new Productionnull_43236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}