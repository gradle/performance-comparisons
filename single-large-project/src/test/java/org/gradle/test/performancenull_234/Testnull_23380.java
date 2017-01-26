package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23380 {
    private final Productionnull_23380 production = new Productionnull_23380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}