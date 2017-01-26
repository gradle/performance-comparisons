package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10040 {
    private final Productionnull_10040 production = new Productionnull_10040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}