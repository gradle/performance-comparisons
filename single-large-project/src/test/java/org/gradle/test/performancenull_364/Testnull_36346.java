package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36346 {
    private final Productionnull_36346 production = new Productionnull_36346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}