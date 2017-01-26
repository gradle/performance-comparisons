package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15262 {
    private final Productionnull_15262 production = new Productionnull_15262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}