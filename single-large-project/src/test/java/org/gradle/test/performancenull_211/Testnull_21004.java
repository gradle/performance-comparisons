package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21004 {
    private final Productionnull_21004 production = new Productionnull_21004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}