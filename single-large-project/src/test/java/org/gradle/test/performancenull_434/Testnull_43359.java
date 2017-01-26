package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43359 {
    private final Productionnull_43359 production = new Productionnull_43359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}