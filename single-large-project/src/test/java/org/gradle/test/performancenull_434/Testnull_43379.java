package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43379 {
    private final Productionnull_43379 production = new Productionnull_43379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}