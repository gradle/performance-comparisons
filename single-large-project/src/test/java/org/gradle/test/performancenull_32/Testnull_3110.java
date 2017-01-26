package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3110 {
    private final Productionnull_3110 production = new Productionnull_3110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}