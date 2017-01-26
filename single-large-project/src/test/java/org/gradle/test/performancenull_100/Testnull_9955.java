package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9955 {
    private final Productionnull_9955 production = new Productionnull_9955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}