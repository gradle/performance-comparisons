package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24920 {
    private final Productionnull_24920 production = new Productionnull_24920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}