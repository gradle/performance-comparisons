package org.gradle.test.performancenull_96;

import static org.junit.Assert.*;

public class Testnull_9580 {
    private final Productionnull_9580 production = new Productionnull_9580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}