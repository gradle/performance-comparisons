package org.gradle.test.performancenull_164;

import static org.junit.Assert.*;

public class Testnull_16382 {
    private final Productionnull_16382 production = new Productionnull_16382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}