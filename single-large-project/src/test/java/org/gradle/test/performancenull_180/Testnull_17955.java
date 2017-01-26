package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17955 {
    private final Productionnull_17955 production = new Productionnull_17955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}