package org.gradle.test.performancenull_116;

import static org.junit.Assert.*;

public class Testnull_11572 {
    private final Productionnull_11572 production = new Productionnull_11572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}