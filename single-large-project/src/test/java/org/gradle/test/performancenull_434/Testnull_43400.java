package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43400 {
    private final Productionnull_43400 production = new Productionnull_43400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}