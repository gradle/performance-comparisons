package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43300 {
    private final Productionnull_43300 production = new Productionnull_43300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}