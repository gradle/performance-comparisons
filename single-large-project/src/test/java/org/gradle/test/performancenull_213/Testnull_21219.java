package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21219 {
    private final Productionnull_21219 production = new Productionnull_21219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}