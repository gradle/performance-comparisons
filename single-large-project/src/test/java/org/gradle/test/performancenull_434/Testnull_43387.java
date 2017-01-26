package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43387 {
    private final Productionnull_43387 production = new Productionnull_43387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}