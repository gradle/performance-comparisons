package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21977 {
    private final Productionnull_21977 production = new Productionnull_21977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}