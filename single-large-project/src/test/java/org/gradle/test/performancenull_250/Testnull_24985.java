package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24985 {
    private final Productionnull_24985 production = new Productionnull_24985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}