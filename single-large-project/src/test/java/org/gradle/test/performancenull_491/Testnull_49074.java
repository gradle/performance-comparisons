package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49074 {
    private final Productionnull_49074 production = new Productionnull_49074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}