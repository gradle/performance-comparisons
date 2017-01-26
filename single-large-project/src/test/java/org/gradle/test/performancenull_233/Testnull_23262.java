package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23262 {
    private final Productionnull_23262 production = new Productionnull_23262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}