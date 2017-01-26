package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20025 {
    private final Productionnull_20025 production = new Productionnull_20025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}