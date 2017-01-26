package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9416 {
    private final Productionnull_9416 production = new Productionnull_9416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}