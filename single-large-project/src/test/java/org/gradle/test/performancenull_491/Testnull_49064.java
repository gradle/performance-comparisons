package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49064 {
    private final Productionnull_49064 production = new Productionnull_49064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}