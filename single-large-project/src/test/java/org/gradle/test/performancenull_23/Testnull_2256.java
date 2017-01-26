package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2256 {
    private final Productionnull_2256 production = new Productionnull_2256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}