package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9941 {
    private final Productionnull_9941 production = new Productionnull_9941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}