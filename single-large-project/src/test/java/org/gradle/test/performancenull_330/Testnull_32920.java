package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32920 {
    private final Productionnull_32920 production = new Productionnull_32920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}