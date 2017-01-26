package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37185 {
    private final Productionnull_37185 production = new Productionnull_37185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}