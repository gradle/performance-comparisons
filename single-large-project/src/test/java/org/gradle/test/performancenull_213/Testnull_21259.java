package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21259 {
    private final Productionnull_21259 production = new Productionnull_21259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}