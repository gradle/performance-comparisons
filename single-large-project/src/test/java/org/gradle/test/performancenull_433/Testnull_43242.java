package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43242 {
    private final Productionnull_43242 production = new Productionnull_43242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}