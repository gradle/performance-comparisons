package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23529 {
    private final Productionnull_23529 production = new Productionnull_23529("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}