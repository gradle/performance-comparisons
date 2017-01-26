package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17920 {
    private final Productionnull_17920 production = new Productionnull_17920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}