package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9455 {
    private final Productionnull_9455 production = new Productionnull_9455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}