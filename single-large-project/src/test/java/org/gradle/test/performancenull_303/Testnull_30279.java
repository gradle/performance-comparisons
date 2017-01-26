package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30279 {
    private final Productionnull_30279 production = new Productionnull_30279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}