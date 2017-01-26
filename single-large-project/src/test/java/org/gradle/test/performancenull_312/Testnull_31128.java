package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31128 {
    private final Productionnull_31128 production = new Productionnull_31128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}