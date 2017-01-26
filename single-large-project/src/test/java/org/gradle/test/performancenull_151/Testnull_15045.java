package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15045 {
    private final Productionnull_15045 production = new Productionnull_15045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}