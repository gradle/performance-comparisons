package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20036 {
    private final Productionnull_20036 production = new Productionnull_20036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}