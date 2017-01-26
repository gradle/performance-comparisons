package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23970 {
    private final Productionnull_23970 production = new Productionnull_23970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}