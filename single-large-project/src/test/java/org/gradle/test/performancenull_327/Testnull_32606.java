package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32606 {
    private final Productionnull_32606 production = new Productionnull_32606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}