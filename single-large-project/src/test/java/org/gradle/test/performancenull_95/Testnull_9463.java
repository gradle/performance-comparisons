package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9463 {
    private final Productionnull_9463 production = new Productionnull_9463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}