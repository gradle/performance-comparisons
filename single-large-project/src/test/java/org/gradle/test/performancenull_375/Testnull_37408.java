package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37408 {
    private final Productionnull_37408 production = new Productionnull_37408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}