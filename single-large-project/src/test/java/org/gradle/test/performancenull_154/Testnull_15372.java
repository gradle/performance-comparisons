package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15372 {
    private final Productionnull_15372 production = new Productionnull_15372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}