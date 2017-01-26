package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12948 {
    private final Productionnull_12948 production = new Productionnull_12948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}