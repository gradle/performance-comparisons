package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9481 {
    private final Productionnull_9481 production = new Productionnull_9481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}