package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15098 {
    private final Productionnull_15098 production = new Productionnull_15098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}