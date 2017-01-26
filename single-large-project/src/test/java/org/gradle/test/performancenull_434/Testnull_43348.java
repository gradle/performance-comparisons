package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43348 {
    private final Productionnull_43348 production = new Productionnull_43348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}