package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43241 {
    private final Productionnull_43241 production = new Productionnull_43241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}