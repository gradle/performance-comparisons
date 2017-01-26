package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25128 {
    private final Productionnull_25128 production = new Productionnull_25128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}