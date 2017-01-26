package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49063 {
    private final Productionnull_49063 production = new Productionnull_49063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}