package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20093 {
    private final Productionnull_20093 production = new Productionnull_20093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}