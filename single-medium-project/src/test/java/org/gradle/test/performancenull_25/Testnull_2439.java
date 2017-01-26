package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2439 {
    private final Productionnull_2439 production = new Productionnull_2439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}