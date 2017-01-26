package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12458 {
    private final Productionnull_12458 production = new Productionnull_12458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}