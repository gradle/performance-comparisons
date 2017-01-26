package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17029 {
    private final Productionnull_17029 production = new Productionnull_17029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}