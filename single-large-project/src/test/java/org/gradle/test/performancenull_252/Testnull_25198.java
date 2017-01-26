package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25198 {
    private final Productionnull_25198 production = new Productionnull_25198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}