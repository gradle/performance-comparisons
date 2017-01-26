package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30128 {
    private final Productionnull_30128 production = new Productionnull_30128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}