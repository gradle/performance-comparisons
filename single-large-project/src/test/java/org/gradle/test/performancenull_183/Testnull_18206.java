package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18206 {
    private final Productionnull_18206 production = new Productionnull_18206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}