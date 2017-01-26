package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43128 {
    private final Productionnull_43128 production = new Productionnull_43128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}