package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15062 {
    private final Productionnull_15062 production = new Productionnull_15062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}