package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20608 {
    private final Productionnull_20608 production = new Productionnull_20608("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}