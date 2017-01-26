package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43223 {
    private final Productionnull_43223 production = new Productionnull_43223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}