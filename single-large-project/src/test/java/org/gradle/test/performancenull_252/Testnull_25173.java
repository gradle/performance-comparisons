package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25173 {
    private final Productionnull_25173 production = new Productionnull_25173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}