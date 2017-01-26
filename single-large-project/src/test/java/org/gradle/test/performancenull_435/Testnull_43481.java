package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43481 {
    private final Productionnull_43481 production = new Productionnull_43481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}