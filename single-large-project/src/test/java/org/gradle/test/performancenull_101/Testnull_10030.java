package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10030 {
    private final Productionnull_10030 production = new Productionnull_10030("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}