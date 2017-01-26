package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1948 {
    private final Productionnull_1948 production = new Productionnull_1948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}