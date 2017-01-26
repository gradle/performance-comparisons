package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3074 {
    private final Productionnull_3074 production = new Productionnull_3074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}