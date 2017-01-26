package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9471 {
    private final Productionnull_9471 production = new Productionnull_9471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}