package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9950 {
    private final Productionnull_9950 production = new Productionnull_9950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}