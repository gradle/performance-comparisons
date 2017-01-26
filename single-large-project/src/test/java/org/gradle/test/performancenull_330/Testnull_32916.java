package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32916 {
    private final Productionnull_32916 production = new Productionnull_32916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}