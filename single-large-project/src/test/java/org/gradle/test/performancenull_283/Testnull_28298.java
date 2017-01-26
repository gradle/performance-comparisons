package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28298 {
    private final Productionnull_28298 production = new Productionnull_28298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}