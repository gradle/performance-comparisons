package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43454 {
    private final Productionnull_43454 production = new Productionnull_43454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}