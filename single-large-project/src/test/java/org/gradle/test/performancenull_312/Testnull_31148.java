package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31148 {
    private final Productionnull_31148 production = new Productionnull_31148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}