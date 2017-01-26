package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2485 {
    private final Productionnull_2485 production = new Productionnull_2485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}