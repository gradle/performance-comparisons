package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17047 {
    private final Productionnull_17047 production = new Productionnull_17047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}