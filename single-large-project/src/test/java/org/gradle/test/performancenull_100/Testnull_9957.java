package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9957 {
    private final Productionnull_9957 production = new Productionnull_9957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}