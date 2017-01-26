package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12482 {
    private final Productionnull_12482 production = new Productionnull_12482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}