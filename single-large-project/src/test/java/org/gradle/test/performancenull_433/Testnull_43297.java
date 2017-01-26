package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43297 {
    private final Productionnull_43297 production = new Productionnull_43297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}