package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11386 {
    private final Productionnull_11386 production = new Productionnull_11386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}