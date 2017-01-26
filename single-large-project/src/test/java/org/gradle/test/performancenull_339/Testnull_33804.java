package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33804 {
    private final Productionnull_33804 production = new Productionnull_33804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}