package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10385 {
    private final Productionnull_10385 production = new Productionnull_10385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}