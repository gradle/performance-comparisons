package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28496 {
    private final Productionnull_28496 production = new Productionnull_28496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}