package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9916 {
    private final Productionnull_9916 production = new Productionnull_9916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}