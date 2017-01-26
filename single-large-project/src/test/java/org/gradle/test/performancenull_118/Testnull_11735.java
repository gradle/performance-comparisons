package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11735 {
    private final Productionnull_11735 production = new Productionnull_11735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}