package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28262 {
    private final Productionnull_28262 production = new Productionnull_28262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}