package org.gradle.test.performancenull_94;

import static org.junit.Assert.*;

public class Testnull_9341 {
    private final Productionnull_9341 production = new Productionnull_9341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}