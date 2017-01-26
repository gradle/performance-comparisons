package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43471 {
    private final Productionnull_43471 production = new Productionnull_43471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}