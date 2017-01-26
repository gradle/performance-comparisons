package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17086 {
    private final Productionnull_17086 production = new Productionnull_17086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}