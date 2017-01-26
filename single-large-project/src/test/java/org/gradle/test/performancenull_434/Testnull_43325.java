package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43325 {
    private final Productionnull_43325 production = new Productionnull_43325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}