package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12279 {
    private final Productionnull_12279 production = new Productionnull_12279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}