package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24473 {
    private final Productionnull_24473 production = new Productionnull_24473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}