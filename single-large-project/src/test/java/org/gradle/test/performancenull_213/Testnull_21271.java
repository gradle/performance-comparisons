package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21271 {
    private final Productionnull_21271 production = new Productionnull_21271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}