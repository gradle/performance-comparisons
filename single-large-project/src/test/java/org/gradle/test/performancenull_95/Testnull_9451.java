package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9451 {
    private final Productionnull_9451 production = new Productionnull_9451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}