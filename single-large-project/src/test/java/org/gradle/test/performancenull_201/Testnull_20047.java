package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20047 {
    private final Productionnull_20047 production = new Productionnull_20047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}