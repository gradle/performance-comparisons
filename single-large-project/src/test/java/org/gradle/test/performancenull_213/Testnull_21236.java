package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21236 {
    private final Productionnull_21236 production = new Productionnull_21236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}