package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43308 {
    private final Productionnull_43308 production = new Productionnull_43308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}