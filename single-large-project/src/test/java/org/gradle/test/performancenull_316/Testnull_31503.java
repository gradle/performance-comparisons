package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31503 {
    private final Productionnull_31503 production = new Productionnull_31503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}