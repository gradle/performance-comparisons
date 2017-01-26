package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11471 {
    private final Productionnull_11471 production = new Productionnull_11471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}