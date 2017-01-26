package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43267 {
    private final Productionnull_43267 production = new Productionnull_43267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}