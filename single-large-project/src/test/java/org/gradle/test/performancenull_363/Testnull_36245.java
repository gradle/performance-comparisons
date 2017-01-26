package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36245 {
    private final Productionnull_36245 production = new Productionnull_36245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}