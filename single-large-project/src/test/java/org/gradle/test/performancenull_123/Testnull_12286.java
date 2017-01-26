package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12286 {
    private final Productionnull_12286 production = new Productionnull_12286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}