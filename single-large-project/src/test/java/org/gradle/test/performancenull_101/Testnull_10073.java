package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10073 {
    private final Productionnull_10073 production = new Productionnull_10073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}