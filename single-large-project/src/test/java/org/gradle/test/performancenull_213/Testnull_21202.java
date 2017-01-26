package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21202 {
    private final Productionnull_21202 production = new Productionnull_21202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}