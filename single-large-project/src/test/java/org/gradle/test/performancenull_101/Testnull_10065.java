package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10065 {
    private final Productionnull_10065 production = new Productionnull_10065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}