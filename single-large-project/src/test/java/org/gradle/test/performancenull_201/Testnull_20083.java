package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20083 {
    private final Productionnull_20083 production = new Productionnull_20083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}