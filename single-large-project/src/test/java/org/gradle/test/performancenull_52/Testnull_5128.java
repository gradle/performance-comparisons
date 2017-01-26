package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5128 {
    private final Productionnull_5128 production = new Productionnull_5128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}