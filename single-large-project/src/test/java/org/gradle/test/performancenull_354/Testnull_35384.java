package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35384 {
    private final Productionnull_35384 production = new Productionnull_35384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}