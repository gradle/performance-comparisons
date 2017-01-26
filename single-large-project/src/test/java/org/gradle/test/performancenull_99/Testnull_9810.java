package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9810 {
    private final Productionnull_9810 production = new Productionnull_9810("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}