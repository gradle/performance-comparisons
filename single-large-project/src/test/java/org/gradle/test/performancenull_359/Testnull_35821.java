package org.gradle.test.performancenull_359;

import static org.junit.Assert.*;

public class Testnull_35821 {
    private final Productionnull_35821 production = new Productionnull_35821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}