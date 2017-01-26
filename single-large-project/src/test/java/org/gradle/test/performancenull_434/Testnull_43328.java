package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43328 {
    private final Productionnull_43328 production = new Productionnull_43328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}