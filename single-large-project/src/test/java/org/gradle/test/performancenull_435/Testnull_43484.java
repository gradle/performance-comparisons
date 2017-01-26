package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43484 {
    private final Productionnull_43484 production = new Productionnull_43484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}