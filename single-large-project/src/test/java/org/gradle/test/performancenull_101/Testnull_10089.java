package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10089 {
    private final Productionnull_10089 production = new Productionnull_10089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}