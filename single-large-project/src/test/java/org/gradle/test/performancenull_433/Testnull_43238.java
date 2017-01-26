package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43238 {
    private final Productionnull_43238 production = new Productionnull_43238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}