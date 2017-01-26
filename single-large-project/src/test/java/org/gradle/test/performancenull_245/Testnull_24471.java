package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24471 {
    private final Productionnull_24471 production = new Productionnull_24471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}