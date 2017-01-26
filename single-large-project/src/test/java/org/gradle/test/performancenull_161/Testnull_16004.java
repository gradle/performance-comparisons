package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16004 {
    private final Productionnull_16004 production = new Productionnull_16004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}