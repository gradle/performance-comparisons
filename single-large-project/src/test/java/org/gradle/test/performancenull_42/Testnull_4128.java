package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4128 {
    private final Productionnull_4128 production = new Productionnull_4128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}