package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14916 {
    private final Productionnull_14916 production = new Productionnull_14916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}