package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2262 {
    private final Productionnull_2262 production = new Productionnull_2262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}