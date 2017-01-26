package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43409 {
    private final Productionnull_43409 production = new Productionnull_43409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}