package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10033 {
    private final Productionnull_10033 production = new Productionnull_10033("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}