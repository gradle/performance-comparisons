package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33580 {
    private final Productionnull_33580 production = new Productionnull_33580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}