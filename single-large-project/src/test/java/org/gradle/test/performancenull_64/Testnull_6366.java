package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6366 {
    private final Productionnull_6366 production = new Productionnull_6366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}