package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23033 {
    private final Productionnull_23033 production = new Productionnull_23033("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}