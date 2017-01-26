package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23173 {
    private final Productionnull_23173 production = new Productionnull_23173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}