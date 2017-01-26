package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36004 {
    private final Productionnull_36004 production = new Productionnull_36004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}