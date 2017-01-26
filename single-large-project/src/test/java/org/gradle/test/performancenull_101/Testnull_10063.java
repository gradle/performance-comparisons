package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10063 {
    private final Productionnull_10063 production = new Productionnull_10063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}