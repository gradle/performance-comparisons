package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31285 {
    private final Productionnull_31285 production = new Productionnull_31285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}