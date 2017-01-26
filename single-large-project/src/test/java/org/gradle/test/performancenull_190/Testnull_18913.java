package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18913 {
    private final Productionnull_18913 production = new Productionnull_18913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}