package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43235 {
    private final Productionnull_43235 production = new Productionnull_43235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}