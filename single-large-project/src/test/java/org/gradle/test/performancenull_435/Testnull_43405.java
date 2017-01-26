package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43405 {
    private final Productionnull_43405 production = new Productionnull_43405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}