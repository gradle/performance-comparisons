package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7901 {
    private final Productionnull_7901 production = new Productionnull_7901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}