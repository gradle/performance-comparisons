package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12901 {
    private final Productionnull_12901 production = new Productionnull_12901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}