package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9092 {
    private final Productionnull_9092 production = new Productionnull_9092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}