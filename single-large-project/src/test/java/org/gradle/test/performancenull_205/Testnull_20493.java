package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20493 {
    private final Productionnull_20493 production = new Productionnull_20493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}