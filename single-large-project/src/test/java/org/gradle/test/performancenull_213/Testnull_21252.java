package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21252 {
    private final Productionnull_21252 production = new Productionnull_21252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}