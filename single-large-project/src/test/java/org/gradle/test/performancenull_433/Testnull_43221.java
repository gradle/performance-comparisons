package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43221 {
    private final Productionnull_43221 production = new Productionnull_43221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}