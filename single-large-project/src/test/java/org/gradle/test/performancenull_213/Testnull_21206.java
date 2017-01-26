package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21206 {
    private final Productionnull_21206 production = new Productionnull_21206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}