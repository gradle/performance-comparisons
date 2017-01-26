package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20063 {
    private final Productionnull_20063 production = new Productionnull_20063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}