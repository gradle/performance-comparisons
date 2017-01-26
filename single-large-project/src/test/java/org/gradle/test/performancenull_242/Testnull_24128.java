package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24128 {
    private final Productionnull_24128 production = new Productionnull_24128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}