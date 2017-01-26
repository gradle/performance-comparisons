package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1480 {
    private final Productionnull_1480 production = new Productionnull_1480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}