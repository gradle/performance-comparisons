package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17004 {
    private final Productionnull_17004 production = new Productionnull_17004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}