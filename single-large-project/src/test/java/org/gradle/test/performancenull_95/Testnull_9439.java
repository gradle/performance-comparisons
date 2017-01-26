package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9439 {
    private final Productionnull_9439 production = new Productionnull_9439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}