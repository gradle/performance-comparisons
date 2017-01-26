package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12299 {
    private final Productionnull_12299 production = new Productionnull_12299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}