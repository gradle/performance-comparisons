package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5400 {
    private final Productionnull_5400 production = new Productionnull_5400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}