package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20454 {
    private final Productionnull_20454 production = new Productionnull_20454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}