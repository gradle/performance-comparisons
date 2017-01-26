package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43341 {
    private final Productionnull_43341 production = new Productionnull_43341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}