package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37563 {
    private final Productionnull_37563 production = new Productionnull_37563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}