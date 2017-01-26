package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36455 {
    private final Productionnull_36455 production = new Productionnull_36455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}