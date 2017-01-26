package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16901 {
    private final Productionnull_16901 production = new Productionnull_16901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}