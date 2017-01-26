package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20464 {
    private final Productionnull_20464 production = new Productionnull_20464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}