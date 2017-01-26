package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12450 {
    private final Productionnull_12450 production = new Productionnull_12450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}