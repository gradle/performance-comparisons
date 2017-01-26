package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36430 {
    private final Productionnull_36430 production = new Productionnull_36430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}