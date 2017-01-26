package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20056 {
    private final Productionnull_20056 production = new Productionnull_20056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}