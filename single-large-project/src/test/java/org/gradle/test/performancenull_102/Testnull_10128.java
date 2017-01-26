package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10128 {
    private final Productionnull_10128 production = new Productionnull_10128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}