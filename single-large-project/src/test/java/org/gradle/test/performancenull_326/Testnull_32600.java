package org.gradle.test.performancenull_326;

import static org.junit.Assert.*;

public class Testnull_32600 {
    private final Productionnull_32600 production = new Productionnull_32600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}