package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11920 {
    private final Productionnull_11920 production = new Productionnull_11920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}