package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20058 {
    private final Productionnull_20058 production = new Productionnull_20058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}