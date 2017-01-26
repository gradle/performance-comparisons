package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36463 {
    private final Productionnull_36463 production = new Productionnull_36463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}