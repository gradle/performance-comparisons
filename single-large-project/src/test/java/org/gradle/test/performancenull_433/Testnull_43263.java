package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43263 {
    private final Productionnull_43263 production = new Productionnull_43263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}