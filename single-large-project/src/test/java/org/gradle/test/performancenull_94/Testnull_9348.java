package org.gradle.test.performancenull_94;

import static org.junit.Assert.*;

public class Testnull_9348 {
    private final Productionnull_9348 production = new Productionnull_9348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}