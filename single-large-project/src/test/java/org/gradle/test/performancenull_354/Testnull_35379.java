package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35379 {
    private final Productionnull_35379 production = new Productionnull_35379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}