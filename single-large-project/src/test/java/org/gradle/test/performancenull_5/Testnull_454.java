package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_454 {
    private final Productionnull_454 production = new Productionnull_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}