package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12408 {
    private final Productionnull_12408 production = new Productionnull_12408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}