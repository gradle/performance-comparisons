package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20521 {
    private final Productionnull_20521 production = new Productionnull_20521("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}