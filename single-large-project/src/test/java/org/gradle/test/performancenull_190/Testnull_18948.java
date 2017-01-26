package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18948 {
    private final Productionnull_18948 production = new Productionnull_18948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}