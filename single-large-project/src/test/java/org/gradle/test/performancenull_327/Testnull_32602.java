package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32602 {
    private final Productionnull_32602 production = new Productionnull_32602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}