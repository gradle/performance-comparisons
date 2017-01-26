package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18932 {
    private final Productionnull_18932 production = new Productionnull_18932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}