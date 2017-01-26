package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10066 {
    private final Productionnull_10066 production = new Productionnull_10066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}