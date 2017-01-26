package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9970 {
    private final Productionnull_9970 production = new Productionnull_9970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}