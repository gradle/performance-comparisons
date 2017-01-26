package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36322 {
    private final Productionnull_36322 production = new Productionnull_36322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}