package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20431 {
    private final Productionnull_20431 production = new Productionnull_20431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}