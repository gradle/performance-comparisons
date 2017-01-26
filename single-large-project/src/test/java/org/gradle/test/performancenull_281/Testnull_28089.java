package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28089 {
    private final Productionnull_28089 production = new Productionnull_28089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}