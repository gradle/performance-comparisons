package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43382 {
    private final Productionnull_43382 production = new Productionnull_43382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}