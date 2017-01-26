package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21299 {
    private final Productionnull_21299 production = new Productionnull_21299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}