package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12290 {
    private final Productionnull_12290 production = new Productionnull_12290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}