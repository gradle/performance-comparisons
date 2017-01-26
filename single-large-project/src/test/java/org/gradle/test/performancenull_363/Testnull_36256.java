package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36256 {
    private final Productionnull_36256 production = new Productionnull_36256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}