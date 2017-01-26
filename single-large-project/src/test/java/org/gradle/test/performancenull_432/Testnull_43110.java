package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43110 {
    private final Productionnull_43110 production = new Productionnull_43110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}