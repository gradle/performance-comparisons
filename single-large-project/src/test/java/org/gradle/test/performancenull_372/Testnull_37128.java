package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37128 {
    private final Productionnull_37128 production = new Productionnull_37128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}