package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36379 {
    private final Productionnull_36379 production = new Productionnull_36379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}