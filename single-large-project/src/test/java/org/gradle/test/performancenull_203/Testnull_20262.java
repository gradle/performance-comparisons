package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20262 {
    private final Productionnull_20262 production = new Productionnull_20262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}