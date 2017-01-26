package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23119 {
    private final Productionnull_23119 production = new Productionnull_23119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}