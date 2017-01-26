package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32768 {
    private final Productionnull_32768 production = new Productionnull_32768("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}