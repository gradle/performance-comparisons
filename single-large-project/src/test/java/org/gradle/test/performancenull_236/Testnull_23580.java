package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23580 {
    private final Productionnull_23580 production = new Productionnull_23580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}