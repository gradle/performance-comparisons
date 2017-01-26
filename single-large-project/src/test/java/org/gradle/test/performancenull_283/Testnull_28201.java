package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28201 {
    private final Productionnull_28201 production = new Productionnull_28201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}