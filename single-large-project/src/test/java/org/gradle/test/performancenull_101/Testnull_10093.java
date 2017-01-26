package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10093 {
    private final Productionnull_10093 production = new Productionnull_10093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}