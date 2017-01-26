package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21256 {
    private final Productionnull_21256 production = new Productionnull_21256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}