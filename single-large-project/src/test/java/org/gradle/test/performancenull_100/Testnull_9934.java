package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9934 {
    private final Productionnull_9934 production = new Productionnull_9934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}