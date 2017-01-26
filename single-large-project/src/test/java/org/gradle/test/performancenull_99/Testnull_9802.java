package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9802 {
    private final Productionnull_9802 production = new Productionnull_9802("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}