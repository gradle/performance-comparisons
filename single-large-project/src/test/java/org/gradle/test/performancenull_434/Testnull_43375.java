package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43375 {
    private final Productionnull_43375 production = new Productionnull_43375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}