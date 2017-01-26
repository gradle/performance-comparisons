package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11463 {
    private final Productionnull_11463 production = new Productionnull_11463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}