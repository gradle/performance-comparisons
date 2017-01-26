package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20352 {
    private final Productionnull_20352 production = new Productionnull_20352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}