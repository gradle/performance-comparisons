package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2206 {
    private final Productionnull_2206 production = new Productionnull_2206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}