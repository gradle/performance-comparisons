package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36128 {
    private final Productionnull_36128 production = new Productionnull_36128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}