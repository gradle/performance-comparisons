package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_128 {
    private final Productionnull_128 production = new Productionnull_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}