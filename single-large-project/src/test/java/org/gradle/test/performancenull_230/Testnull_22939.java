package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22939 {
    private final Productionnull_22939 production = new Productionnull_22939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}