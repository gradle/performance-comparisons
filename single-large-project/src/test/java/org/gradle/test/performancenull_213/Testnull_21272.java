package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21272 {
    private final Productionnull_21272 production = new Productionnull_21272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}