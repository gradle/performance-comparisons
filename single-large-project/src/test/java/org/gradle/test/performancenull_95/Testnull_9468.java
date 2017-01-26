package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9468 {
    private final Productionnull_9468 production = new Productionnull_9468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}