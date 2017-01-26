package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26123 {
    private final Productionnull_26123 production = new Productionnull_26123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}