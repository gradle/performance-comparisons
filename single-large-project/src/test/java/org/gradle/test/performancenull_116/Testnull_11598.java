package org.gradle.test.performancenull_116;

import static org.junit.Assert.*;

public class Testnull_11598 {
    private final Productionnull_11598 production = new Productionnull_11598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}