package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13948 {
    private final Productionnull_13948 production = new Productionnull_13948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}