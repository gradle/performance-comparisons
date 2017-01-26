package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43482 {
    private final Productionnull_43482 production = new Productionnull_43482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}