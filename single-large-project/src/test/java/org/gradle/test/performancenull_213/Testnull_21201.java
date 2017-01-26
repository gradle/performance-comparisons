package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21201 {
    private final Productionnull_21201 production = new Productionnull_21201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}