package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6308 {
    private final Productionnull_6308 production = new Productionnull_6308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}