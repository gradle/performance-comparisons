package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21293 {
    private final Productionnull_21293 production = new Productionnull_21293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}