package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43376 {
    private final Productionnull_43376 production = new Productionnull_43376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}