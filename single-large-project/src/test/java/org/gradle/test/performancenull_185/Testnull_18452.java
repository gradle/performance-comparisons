package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18452 {
    private final Productionnull_18452 production = new Productionnull_18452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}