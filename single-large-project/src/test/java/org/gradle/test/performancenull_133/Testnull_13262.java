package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13262 {
    private final Productionnull_13262 production = new Productionnull_13262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}