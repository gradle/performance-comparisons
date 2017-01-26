package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17073 {
    private final Productionnull_17073 production = new Productionnull_17073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}