package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35363 {
    private final Productionnull_35363 production = new Productionnull_35363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}