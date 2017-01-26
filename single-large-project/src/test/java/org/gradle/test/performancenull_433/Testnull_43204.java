package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43204 {
    private final Productionnull_43204 production = new Productionnull_43204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}