package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23689 {
    private final Productionnull_23689 production = new Productionnull_23689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}