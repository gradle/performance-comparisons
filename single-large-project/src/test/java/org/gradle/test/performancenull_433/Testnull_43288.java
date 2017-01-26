package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43288 {
    private final Productionnull_43288 production = new Productionnull_43288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}