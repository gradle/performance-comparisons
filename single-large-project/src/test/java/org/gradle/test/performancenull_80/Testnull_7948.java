package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7948 {
    private final Productionnull_7948 production = new Productionnull_7948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}