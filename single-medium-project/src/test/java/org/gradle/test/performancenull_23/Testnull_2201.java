package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2201 {
    private final Productionnull_2201 production = new Productionnull_2201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}