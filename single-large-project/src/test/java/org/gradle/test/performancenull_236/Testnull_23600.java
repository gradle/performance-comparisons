package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23600 {
    private final Productionnull_23600 production = new Productionnull_23600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}