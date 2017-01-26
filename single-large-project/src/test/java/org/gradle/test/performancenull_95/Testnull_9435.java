package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9435 {
    private final Productionnull_9435 production = new Productionnull_9435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}