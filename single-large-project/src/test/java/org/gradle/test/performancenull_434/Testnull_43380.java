package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43380 {
    private final Productionnull_43380 production = new Productionnull_43380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}