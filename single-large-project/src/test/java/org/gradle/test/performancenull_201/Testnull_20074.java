package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20074 {
    private final Productionnull_20074 production = new Productionnull_20074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}