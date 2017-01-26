package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32909 {
    private final Productionnull_32909 production = new Productionnull_32909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}