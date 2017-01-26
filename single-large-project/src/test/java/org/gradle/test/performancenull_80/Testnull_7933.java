package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7933 {
    private final Productionnull_7933 production = new Productionnull_7933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}