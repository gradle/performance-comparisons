package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18128 {
    private final Productionnull_18128 production = new Productionnull_18128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}