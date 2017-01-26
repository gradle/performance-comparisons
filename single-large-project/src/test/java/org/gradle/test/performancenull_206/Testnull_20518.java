package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20518 {
    private final Productionnull_20518 production = new Productionnull_20518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}