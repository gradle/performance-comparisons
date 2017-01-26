package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35354 {
    private final Productionnull_35354 production = new Productionnull_35354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}