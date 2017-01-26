package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43095 {
    private final Productionnull_43095 production = new Productionnull_43095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}