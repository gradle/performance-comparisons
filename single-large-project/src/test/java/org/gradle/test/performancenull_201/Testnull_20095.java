package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20095 {
    private final Productionnull_20095 production = new Productionnull_20095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}