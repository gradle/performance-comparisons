package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15366 {
    private final Productionnull_15366 production = new Productionnull_15366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}