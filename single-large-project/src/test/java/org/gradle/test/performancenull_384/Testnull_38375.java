package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38375 {
    private final Productionnull_38375 production = new Productionnull_38375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}