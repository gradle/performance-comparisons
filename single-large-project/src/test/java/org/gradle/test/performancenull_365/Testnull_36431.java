package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36431 {
    private final Productionnull_36431 production = new Productionnull_36431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}