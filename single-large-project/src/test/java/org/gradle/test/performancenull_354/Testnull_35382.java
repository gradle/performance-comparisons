package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35382 {
    private final Productionnull_35382 production = new Productionnull_35382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}