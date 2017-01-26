package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23871 {
    private final Productionnull_23871 production = new Productionnull_23871("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}