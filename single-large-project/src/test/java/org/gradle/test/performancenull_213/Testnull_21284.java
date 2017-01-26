package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21284 {
    private final Productionnull_21284 production = new Productionnull_21284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}