package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9453 {
    private final Productionnull_9453 production = new Productionnull_9453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}