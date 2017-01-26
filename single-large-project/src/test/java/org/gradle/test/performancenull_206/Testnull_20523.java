package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20523 {
    private final Productionnull_20523 production = new Productionnull_20523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}