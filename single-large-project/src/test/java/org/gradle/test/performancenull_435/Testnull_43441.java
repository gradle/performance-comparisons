package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43441 {
    private final Productionnull_43441 production = new Productionnull_43441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}