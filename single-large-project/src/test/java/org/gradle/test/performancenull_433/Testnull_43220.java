package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43220 {
    private final Productionnull_43220 production = new Productionnull_43220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}