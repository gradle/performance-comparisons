package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43275 {
    private final Productionnull_43275 production = new Productionnull_43275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}