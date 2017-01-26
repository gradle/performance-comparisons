package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43259 {
    private final Productionnull_43259 production = new Productionnull_43259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}