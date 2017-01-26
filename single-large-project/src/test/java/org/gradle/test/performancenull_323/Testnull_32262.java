package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32262 {
    private final Productionnull_32262 production = new Productionnull_32262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}