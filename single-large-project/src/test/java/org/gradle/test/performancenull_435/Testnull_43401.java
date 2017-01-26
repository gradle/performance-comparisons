package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43401 {
    private final Productionnull_43401 production = new Productionnull_43401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}