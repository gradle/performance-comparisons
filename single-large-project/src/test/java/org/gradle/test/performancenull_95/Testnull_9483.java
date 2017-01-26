package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9483 {
    private final Productionnull_9483 production = new Productionnull_9483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}