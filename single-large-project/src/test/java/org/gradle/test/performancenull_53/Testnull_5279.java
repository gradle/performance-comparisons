package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5279 {
    private final Productionnull_5279 production = new Productionnull_5279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}