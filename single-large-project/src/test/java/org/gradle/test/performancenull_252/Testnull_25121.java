package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25121 {
    private final Productionnull_25121 production = new Productionnull_25121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}