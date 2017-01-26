package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6301 {
    private final Productionnull_6301 production = new Productionnull_6301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}