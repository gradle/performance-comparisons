package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12285 {
    private final Productionnull_12285 production = new Productionnull_12285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}