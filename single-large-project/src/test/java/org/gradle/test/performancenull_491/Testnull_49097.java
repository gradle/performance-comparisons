package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49097 {
    private final Productionnull_49097 production = new Productionnull_49097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}