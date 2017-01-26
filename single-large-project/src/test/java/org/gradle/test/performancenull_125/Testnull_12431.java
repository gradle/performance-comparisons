package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12431 {
    private final Productionnull_12431 production = new Productionnull_12431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}