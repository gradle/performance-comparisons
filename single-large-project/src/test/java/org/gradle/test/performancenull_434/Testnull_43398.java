package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43398 {
    private final Productionnull_43398 production = new Productionnull_43398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}