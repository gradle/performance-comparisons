package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17098 {
    private final Productionnull_17098 production = new Productionnull_17098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}