package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32801 {
    private final Productionnull_32801 production = new Productionnull_32801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}