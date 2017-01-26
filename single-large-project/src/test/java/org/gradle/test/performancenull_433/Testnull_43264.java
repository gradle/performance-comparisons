package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43264 {
    private final Productionnull_43264 production = new Productionnull_43264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}