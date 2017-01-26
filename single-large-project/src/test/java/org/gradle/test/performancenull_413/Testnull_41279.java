package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41279 {
    private final Productionnull_41279 production = new Productionnull_41279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}