package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24271 {
    private final Productionnull_24271 production = new Productionnull_24271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}