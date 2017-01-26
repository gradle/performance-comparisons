package org.gradle.test.performancenull_163;

import static org.junit.Assert.*;

public class Testnull_16262 {
    private final Productionnull_16262 production = new Productionnull_16262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}