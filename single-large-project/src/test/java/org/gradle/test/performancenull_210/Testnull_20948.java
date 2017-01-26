package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20948 {
    private final Productionnull_20948 production = new Productionnull_20948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}