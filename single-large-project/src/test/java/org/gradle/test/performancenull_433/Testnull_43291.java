package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43291 {
    private final Productionnull_43291 production = new Productionnull_43291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}