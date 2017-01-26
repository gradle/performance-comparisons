package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21223 {
    private final Productionnull_21223 production = new Productionnull_21223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}