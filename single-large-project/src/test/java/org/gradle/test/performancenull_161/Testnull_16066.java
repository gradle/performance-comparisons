package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16066 {
    private final Productionnull_16066 production = new Productionnull_16066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}