package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9441 {
    private final Productionnull_9441 production = new Productionnull_9441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}