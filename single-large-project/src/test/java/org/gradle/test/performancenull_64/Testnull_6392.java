package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6392 {
    private final Productionnull_6392 production = new Productionnull_6392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}