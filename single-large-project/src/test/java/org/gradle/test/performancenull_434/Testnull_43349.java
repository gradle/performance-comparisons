package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43349 {
    private final Productionnull_43349 production = new Productionnull_43349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}