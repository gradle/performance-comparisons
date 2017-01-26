package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20010 {
    private final Productionnull_20010 production = new Productionnull_20010("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}