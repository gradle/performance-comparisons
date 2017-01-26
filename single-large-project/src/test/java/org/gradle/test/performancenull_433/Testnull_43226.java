package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43226 {
    private final Productionnull_43226 production = new Productionnull_43226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}