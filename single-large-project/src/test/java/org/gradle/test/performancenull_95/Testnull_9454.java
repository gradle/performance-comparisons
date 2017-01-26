package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9454 {
    private final Productionnull_9454 production = new Productionnull_9454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}