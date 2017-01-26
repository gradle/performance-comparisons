package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20040 {
    private final Productionnull_20040 production = new Productionnull_20040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}