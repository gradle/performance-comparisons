package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10004 {
    private final Productionnull_10004 production = new Productionnull_10004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}