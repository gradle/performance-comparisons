package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43396 {
    private final Productionnull_43396 production = new Productionnull_43396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}