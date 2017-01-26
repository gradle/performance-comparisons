package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9428 {
    private final Productionnull_9428 production = new Productionnull_9428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}