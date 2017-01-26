package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43374 {
    private final Productionnull_43374 production = new Productionnull_43374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}