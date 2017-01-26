package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43419 {
    private final Productionnull_43419 production = new Productionnull_43419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}