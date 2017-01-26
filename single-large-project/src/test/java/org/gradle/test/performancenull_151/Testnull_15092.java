package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15092 {
    private final Productionnull_15092 production = new Productionnull_15092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}