package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28259 {
    private final Productionnull_28259 production = new Productionnull_28259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}