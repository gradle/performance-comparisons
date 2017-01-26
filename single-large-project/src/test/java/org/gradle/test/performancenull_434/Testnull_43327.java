package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43327 {
    private final Productionnull_43327 production = new Productionnull_43327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}