package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43290 {
    private final Productionnull_43290 production = new Productionnull_43290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}