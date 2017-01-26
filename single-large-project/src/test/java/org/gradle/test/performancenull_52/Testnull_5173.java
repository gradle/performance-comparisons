package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5173 {
    private final Productionnull_5173 production = new Productionnull_5173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}