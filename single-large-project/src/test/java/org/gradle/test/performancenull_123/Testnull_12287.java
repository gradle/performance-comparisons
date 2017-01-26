package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12287 {
    private final Productionnull_12287 production = new Productionnull_12287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}