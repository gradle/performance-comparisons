package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12248 {
    private final Productionnull_12248 production = new Productionnull_12248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}