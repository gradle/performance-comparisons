package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20625 {
    private final Productionnull_20625 production = new Productionnull_20625("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}