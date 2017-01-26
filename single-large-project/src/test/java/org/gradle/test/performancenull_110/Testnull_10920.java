package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10920 {
    private final Productionnull_10920 production = new Productionnull_10920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}