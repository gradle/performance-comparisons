package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20583 {
    private final Productionnull_20583 production = new Productionnull_20583("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}