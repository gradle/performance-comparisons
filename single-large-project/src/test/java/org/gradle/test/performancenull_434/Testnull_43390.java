package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43390 {
    private final Productionnull_43390 production = new Productionnull_43390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}