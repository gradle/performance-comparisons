package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2385 {
    private final Productionnull_2385 production = new Productionnull_2385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}