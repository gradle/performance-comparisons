package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43340 {
    private final Productionnull_43340 production = new Productionnull_43340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}