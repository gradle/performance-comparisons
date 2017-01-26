package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1496 {
    private final Productionnull_1496 production = new Productionnull_1496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}