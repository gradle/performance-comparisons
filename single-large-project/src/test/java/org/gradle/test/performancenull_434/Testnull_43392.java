package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43392 {
    private final Productionnull_43392 production = new Productionnull_43392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}