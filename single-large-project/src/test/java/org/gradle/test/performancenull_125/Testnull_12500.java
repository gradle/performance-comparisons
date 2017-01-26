package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12500 {
    private final Productionnull_12500 production = new Productionnull_12500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}