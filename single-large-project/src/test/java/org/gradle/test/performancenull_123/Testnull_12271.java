package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12271 {
    private final Productionnull_12271 production = new Productionnull_12271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}