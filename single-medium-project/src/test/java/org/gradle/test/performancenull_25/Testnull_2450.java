package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2450 {
    private final Productionnull_2450 production = new Productionnull_2450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}