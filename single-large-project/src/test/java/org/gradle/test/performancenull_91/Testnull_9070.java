package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9070 {
    private final Productionnull_9070 production = new Productionnull_9070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}