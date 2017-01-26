package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20529 {
    private final Productionnull_20529 production = new Productionnull_20529("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}