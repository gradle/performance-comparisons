package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9821 {
    private final Productionnull_9821 production = new Productionnull_9821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}