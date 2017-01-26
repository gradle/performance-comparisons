package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21224 {
    private final Productionnull_21224 production = new Productionnull_21224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}