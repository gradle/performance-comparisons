package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43378 {
    private final Productionnull_43378 production = new Productionnull_43378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}