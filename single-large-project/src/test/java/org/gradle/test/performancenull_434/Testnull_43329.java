package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43329 {
    private final Productionnull_43329 production = new Productionnull_43329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}