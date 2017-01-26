package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35454 {
    private final Productionnull_35454 production = new Productionnull_35454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}