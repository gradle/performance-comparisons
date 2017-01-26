package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12300 {
    private final Productionnull_12300 production = new Productionnull_12300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}