package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43483 {
    private final Productionnull_43483 production = new Productionnull_43483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}