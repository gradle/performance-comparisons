package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17089 {
    private final Productionnull_17089 production = new Productionnull_17089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}