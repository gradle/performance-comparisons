package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15086 {
    private final Productionnull_15086 production = new Productionnull_15086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}