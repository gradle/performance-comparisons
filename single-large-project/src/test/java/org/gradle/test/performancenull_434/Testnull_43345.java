package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43345 {
    private final Productionnull_43345 production = new Productionnull_43345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}