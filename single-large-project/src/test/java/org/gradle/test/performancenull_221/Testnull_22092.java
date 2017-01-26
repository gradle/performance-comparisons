package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22092 {
    private final Productionnull_22092 production = new Productionnull_22092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}