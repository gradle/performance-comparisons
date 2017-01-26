package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20439 {
    private final Productionnull_20439 production = new Productionnull_20439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}