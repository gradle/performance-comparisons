package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3124 {
    private final Productionnull_3124 production = new Productionnull_3124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}