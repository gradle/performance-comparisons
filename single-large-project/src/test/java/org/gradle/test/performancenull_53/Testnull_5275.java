package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5275 {
    private final Productionnull_5275 production = new Productionnull_5275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}