package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20689 {
    private final Productionnull_20689 production = new Productionnull_20689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}