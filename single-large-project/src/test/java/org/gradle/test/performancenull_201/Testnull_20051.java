package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20051 {
    private final Productionnull_20051 production = new Productionnull_20051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}