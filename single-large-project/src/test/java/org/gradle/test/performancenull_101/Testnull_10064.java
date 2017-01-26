package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10064 {
    private final Productionnull_10064 production = new Productionnull_10064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}