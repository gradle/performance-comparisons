package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15375 {
    private final Productionnull_15375 production = new Productionnull_15375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}