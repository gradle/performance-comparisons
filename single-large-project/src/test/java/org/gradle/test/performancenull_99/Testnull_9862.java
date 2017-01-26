package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9862 {
    private final Productionnull_9862 production = new Productionnull_9862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}