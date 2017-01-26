package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35386 {
    private final Productionnull_35386 production = new Productionnull_35386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}