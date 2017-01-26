package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12263 {
    private final Productionnull_12263 production = new Productionnull_12263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}