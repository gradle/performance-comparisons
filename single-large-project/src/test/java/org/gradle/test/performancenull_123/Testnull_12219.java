package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12219 {
    private final Productionnull_12219 production = new Productionnull_12219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}