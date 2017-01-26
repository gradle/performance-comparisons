package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43416 {
    private final Productionnull_43416 production = new Productionnull_43416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}