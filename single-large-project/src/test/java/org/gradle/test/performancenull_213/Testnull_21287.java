package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21287 {
    private final Productionnull_21287 production = new Productionnull_21287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}