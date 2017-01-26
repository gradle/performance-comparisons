package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9803 {
    private final Productionnull_9803 production = new Productionnull_9803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}