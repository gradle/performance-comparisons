package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20086 {
    private final Productionnull_20086 production = new Productionnull_20086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}