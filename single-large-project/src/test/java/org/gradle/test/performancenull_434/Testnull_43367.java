package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43367 {
    private final Productionnull_43367 production = new Productionnull_43367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}