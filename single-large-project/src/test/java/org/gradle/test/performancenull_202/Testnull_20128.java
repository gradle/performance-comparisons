package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20128 {
    private final Productionnull_20128 production = new Productionnull_20128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}