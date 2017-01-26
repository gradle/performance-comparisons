package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42128 {
    private final Productionnull_42128 production = new Productionnull_42128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}