package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15068 {
    private final Productionnull_15068 production = new Productionnull_15068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}