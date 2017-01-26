package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3120 {
    private final Productionnull_3120 production = new Productionnull_3120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}