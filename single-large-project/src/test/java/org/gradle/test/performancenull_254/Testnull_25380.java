package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25380 {
    private final Productionnull_25380 production = new Productionnull_25380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}