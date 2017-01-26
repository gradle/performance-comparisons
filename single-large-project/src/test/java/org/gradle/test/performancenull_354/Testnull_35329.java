package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35329 {
    private final Productionnull_35329 production = new Productionnull_35329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}