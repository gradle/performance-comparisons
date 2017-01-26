package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21262 {
    private final Productionnull_21262 production = new Productionnull_21262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}