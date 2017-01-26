package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19169 {
    private final Productionnull_19169 production = new Productionnull_19169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}