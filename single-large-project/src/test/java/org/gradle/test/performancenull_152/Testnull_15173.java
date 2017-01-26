package org.gradle.test.performancenull_152;

import static org.junit.Assert.*;

public class Testnull_15173 {
    private final Productionnull_15173 production = new Productionnull_15173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}