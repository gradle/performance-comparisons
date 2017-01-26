package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9860 {
    private final Productionnull_9860 production = new Productionnull_9860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}