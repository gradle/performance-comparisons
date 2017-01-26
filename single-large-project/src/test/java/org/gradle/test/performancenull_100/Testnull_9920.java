package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9920 {
    private final Productionnull_9920 production = new Productionnull_9920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}