package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2285 {
    private final Productionnull_2285 production = new Productionnull_2285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}