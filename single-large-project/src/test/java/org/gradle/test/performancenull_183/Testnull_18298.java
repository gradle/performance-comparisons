package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18298 {
    private final Productionnull_18298 production = new Productionnull_18298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}