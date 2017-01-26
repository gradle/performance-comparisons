package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31386 {
    private final Productionnull_31386 production = new Productionnull_31386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}