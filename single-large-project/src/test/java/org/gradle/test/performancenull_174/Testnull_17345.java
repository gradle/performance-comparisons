package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17345 {
    private final Productionnull_17345 production = new Productionnull_17345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}