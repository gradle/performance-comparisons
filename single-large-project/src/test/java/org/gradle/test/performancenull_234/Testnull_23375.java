package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23375 {
    private final Productionnull_23375 production = new Productionnull_23375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}