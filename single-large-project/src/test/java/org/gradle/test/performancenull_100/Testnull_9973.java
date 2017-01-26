package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9973 {
    private final Productionnull_9973 production = new Productionnull_9973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}