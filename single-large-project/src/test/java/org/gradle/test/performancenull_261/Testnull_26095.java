package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26095 {
    private final Productionnull_26095 production = new Productionnull_26095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}