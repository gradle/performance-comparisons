package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43485 {
    private final Productionnull_43485 production = new Productionnull_43485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}