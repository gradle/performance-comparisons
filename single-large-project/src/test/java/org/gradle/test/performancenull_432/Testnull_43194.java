package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43194 {
    private final Productionnull_43194 production = new Productionnull_43194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}