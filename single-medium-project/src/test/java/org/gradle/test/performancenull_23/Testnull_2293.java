package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2293 {
    private final Productionnull_2293 production = new Productionnull_2293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}