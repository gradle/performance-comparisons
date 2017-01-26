package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20279 {
    private final Productionnull_20279 production = new Productionnull_20279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}