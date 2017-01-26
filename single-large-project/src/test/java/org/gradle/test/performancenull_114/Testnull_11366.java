package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11366 {
    private final Productionnull_11366 production = new Productionnull_11366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}