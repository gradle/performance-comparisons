package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43262 {
    private final Productionnull_43262 production = new Productionnull_43262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}