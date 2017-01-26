package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33823 {
    private final Productionnull_33823 production = new Productionnull_33823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}