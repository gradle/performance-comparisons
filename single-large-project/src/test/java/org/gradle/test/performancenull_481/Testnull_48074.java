package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48074 {
    private final Productionnull_48074 production = new Productionnull_48074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}