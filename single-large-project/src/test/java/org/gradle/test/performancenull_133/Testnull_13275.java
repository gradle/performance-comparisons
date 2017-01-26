package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13275 {
    private final Productionnull_13275 production = new Productionnull_13275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}