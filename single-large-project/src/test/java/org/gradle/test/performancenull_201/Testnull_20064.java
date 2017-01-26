package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20064 {
    private final Productionnull_20064 production = new Productionnull_20064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}