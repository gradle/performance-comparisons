package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15004 {
    private final Productionnull_15004 production = new Productionnull_15004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}