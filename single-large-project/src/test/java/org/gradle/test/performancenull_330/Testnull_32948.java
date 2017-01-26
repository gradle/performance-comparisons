package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32948 {
    private final Productionnull_32948 production = new Productionnull_32948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}