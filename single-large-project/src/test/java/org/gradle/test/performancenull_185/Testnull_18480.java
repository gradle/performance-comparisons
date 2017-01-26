package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18480 {
    private final Productionnull_18480 production = new Productionnull_18480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}