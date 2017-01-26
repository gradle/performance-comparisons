package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19128 {
    private final Productionnull_19128 production = new Productionnull_19128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}