package org.gradle.test.performancenull_94;

import static org.junit.Assert.*;

public class Testnull_9398 {
    private final Productionnull_9398 production = new Productionnull_9398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}