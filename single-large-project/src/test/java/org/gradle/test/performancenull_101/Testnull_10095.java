package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10095 {
    private final Productionnull_10095 production = new Productionnull_10095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}