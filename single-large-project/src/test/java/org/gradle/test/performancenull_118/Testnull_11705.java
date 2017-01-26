package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11705 {
    private final Productionnull_11705 production = new Productionnull_11705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}