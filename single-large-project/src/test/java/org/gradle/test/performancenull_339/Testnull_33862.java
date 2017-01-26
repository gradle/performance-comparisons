package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33862 {
    private final Productionnull_33862 production = new Productionnull_33862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}