package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36352 {
    private final Productionnull_36352 production = new Productionnull_36352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}