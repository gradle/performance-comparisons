package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16967 {
    private final Productionnull_16967 production = new Productionnull_16967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}