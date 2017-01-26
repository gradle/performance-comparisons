package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12385 {
    private final Productionnull_12385 production = new Productionnull_12385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}