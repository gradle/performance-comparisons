package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23563 {
    private final Productionnull_23563 production = new Productionnull_23563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}