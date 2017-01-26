package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43426 {
    private final Productionnull_43426 production = new Productionnull_43426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}