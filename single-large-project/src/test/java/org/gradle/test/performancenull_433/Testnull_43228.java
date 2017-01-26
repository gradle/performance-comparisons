package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43228 {
    private final Productionnull_43228 production = new Productionnull_43228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}