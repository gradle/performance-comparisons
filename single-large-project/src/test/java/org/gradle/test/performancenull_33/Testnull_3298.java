package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3298 {
    private final Productionnull_3298 production = new Productionnull_3298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}