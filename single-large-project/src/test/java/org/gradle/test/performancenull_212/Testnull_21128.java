package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21128 {
    private final Productionnull_21128 production = new Productionnull_21128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}