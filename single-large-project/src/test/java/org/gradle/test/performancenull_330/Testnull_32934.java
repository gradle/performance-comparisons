package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32934 {
    private final Productionnull_32934 production = new Productionnull_32934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}