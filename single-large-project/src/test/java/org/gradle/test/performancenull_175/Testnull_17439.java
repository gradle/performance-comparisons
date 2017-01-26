package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17439 {
    private final Productionnull_17439 production = new Productionnull_17439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}