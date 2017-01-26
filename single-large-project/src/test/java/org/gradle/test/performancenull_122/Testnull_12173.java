package org.gradle.test.performancenull_122;

import static org.junit.Assert.*;

public class Testnull_12173 {
    private final Productionnull_12173 production = new Productionnull_12173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}