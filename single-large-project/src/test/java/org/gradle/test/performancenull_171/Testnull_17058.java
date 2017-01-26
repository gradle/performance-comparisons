package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17058 {
    private final Productionnull_17058 production = new Productionnull_17058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}