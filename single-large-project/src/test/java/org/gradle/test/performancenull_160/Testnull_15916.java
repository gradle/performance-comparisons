package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15916 {
    private final Productionnull_15916 production = new Productionnull_15916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}