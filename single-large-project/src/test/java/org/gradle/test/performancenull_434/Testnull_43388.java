package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43388 {
    private final Productionnull_43388 production = new Productionnull_43388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}