package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21227 {
    private final Productionnull_21227 production = new Productionnull_21227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}