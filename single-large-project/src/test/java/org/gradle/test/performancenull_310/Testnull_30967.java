package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30967 {
    private final Productionnull_30967 production = new Productionnull_30967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}