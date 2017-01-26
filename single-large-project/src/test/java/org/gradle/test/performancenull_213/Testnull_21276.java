package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21276 {
    private final Productionnull_21276 production = new Productionnull_21276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}