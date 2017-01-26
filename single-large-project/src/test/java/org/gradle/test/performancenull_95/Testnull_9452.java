package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9452 {
    private final Productionnull_9452 production = new Productionnull_9452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}