package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22128 {
    private final Productionnull_22128 production = new Productionnull_22128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}