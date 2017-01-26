package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9408 {
    private final Productionnull_9408 production = new Productionnull_9408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}