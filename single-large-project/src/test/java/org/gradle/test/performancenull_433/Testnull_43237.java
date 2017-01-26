package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43237 {
    private final Productionnull_43237 production = new Productionnull_43237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}