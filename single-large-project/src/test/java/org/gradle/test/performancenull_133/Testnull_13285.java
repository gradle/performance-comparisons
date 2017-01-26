package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13285 {
    private final Productionnull_13285 production = new Productionnull_13285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}