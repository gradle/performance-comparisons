package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20416 {
    private final Productionnull_20416 production = new Productionnull_20416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}