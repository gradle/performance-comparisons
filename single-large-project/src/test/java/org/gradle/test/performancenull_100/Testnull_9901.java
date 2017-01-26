package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9901 {
    private final Productionnull_9901 production = new Productionnull_9901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}