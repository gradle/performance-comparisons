package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43265 {
    private final Productionnull_43265 production = new Productionnull_43265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}