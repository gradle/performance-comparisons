package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10045 {
    private final Productionnull_10045 production = new Productionnull_10045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}