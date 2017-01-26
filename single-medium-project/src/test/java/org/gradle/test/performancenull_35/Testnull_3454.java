package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3454 {
    private final Productionnull_3454 production = new Productionnull_3454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}