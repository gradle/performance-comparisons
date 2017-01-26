package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20030 {
    private final Productionnull_20030 production = new Productionnull_20030("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}