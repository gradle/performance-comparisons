package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3128 {
    private final Productionnull_3128 production = new Productionnull_3128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}