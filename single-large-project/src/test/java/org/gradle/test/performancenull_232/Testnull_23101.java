package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23101 {
    private final Productionnull_23101 production = new Productionnull_23101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}