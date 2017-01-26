package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43389 {
    private final Productionnull_43389 production = new Productionnull_43389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}