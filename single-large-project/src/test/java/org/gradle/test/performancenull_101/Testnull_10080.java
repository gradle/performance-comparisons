package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10080 {
    private final Productionnull_10080 production = new Productionnull_10080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}