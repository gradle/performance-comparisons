package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17092 {
    private final Productionnull_17092 production = new Productionnull_17092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}