package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20376 {
    private final Productionnull_20376 production = new Productionnull_20376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}