package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43249 {
    private final Productionnull_43249 production = new Productionnull_43249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}