package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28275 {
    private final Productionnull_28275 production = new Productionnull_28275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}