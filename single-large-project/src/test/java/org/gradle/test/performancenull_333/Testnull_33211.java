package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33211 {
    private final Productionnull_33211 production = new Productionnull_33211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}