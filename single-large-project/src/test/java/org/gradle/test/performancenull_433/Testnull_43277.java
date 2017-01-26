package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43277 {
    private final Productionnull_43277 production = new Productionnull_43277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}