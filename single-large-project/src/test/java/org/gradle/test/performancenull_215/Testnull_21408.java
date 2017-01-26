package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21408 {
    private final Productionnull_21408 production = new Productionnull_21408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}