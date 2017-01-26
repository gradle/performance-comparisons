package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12409 {
    private final Productionnull_12409 production = new Productionnull_12409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}