package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41128 {
    private final Productionnull_41128 production = new Productionnull_41128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}