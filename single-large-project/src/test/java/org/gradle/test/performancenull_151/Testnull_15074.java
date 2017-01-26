package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15074 {
    private final Productionnull_15074 production = new Productionnull_15074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}