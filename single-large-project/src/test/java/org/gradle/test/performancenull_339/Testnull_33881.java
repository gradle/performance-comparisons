package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33881 {
    private final Productionnull_33881 production = new Productionnull_33881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}