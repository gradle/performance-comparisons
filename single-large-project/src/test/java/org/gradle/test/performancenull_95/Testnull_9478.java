package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9478 {
    private final Productionnull_9478 production = new Productionnull_9478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}