package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18123 {
    private final Productionnull_18123 production = new Productionnull_18123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}