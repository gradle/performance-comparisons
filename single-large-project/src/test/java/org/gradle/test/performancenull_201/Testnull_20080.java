package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20080 {
    private final Productionnull_20080 production = new Productionnull_20080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}