package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48478 {
    private final Productionnull_48478 production = new Productionnull_48478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}