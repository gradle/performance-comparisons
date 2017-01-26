package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22901 {
    private final Productionnull_22901 production = new Productionnull_22901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}