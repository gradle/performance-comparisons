package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36403 {
    private final Productionnull_36403 production = new Productionnull_36403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}