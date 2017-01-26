package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20604 {
    private final Productionnull_20604 production = new Productionnull_20604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}