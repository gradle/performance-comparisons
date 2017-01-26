package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43366 {
    private final Productionnull_43366 production = new Productionnull_43366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}