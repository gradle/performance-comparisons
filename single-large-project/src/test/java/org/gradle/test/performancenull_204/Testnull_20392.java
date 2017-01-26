package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20392 {
    private final Productionnull_20392 production = new Productionnull_20392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}