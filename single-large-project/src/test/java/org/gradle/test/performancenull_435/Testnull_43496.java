package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43496 {
    private final Productionnull_43496 production = new Productionnull_43496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}