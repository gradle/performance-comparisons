package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20503 {
    private final Productionnull_20503 production = new Productionnull_20503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}