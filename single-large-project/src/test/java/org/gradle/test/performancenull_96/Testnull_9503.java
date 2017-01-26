package org.gradle.test.performancenull_96;

import static org.junit.Assert.*;

public class Testnull_9503 {
    private final Productionnull_9503 production = new Productionnull_9503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}