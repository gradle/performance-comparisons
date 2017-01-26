package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12275 {
    private final Productionnull_12275 production = new Productionnull_12275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}