package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43458 {
    private final Productionnull_43458 production = new Productionnull_43458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}