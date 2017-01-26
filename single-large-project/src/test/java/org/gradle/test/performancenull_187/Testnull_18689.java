package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18689 {
    private final Productionnull_18689 production = new Productionnull_18689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}