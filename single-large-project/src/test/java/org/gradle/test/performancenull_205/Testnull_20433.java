package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20433 {
    private final Productionnull_20433 production = new Productionnull_20433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}