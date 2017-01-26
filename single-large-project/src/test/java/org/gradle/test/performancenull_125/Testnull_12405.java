package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12405 {
    private final Productionnull_12405 production = new Productionnull_12405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}