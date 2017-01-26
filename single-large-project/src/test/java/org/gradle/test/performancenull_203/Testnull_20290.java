package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20290 {
    private final Productionnull_20290 production = new Productionnull_20290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}