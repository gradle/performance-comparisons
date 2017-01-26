package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25177 {
    private final Productionnull_25177 production = new Productionnull_25177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}