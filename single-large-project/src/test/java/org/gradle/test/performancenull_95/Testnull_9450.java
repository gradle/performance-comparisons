package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9450 {
    private final Productionnull_9450 production = new Productionnull_9450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}