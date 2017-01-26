package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3660 {
    private final Productionnull_3660 production = new Productionnull_3660("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}