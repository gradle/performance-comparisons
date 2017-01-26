package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43206 {
    private final Productionnull_43206 production = new Productionnull_43206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}