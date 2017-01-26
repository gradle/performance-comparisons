package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35375 {
    private final Productionnull_35375 production = new Productionnull_35375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}