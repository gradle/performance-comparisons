package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34128 {
    private final Productionnull_34128 production = new Productionnull_34128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}