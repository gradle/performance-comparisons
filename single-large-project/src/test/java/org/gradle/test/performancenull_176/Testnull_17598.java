package org.gradle.test.performancenull_176;

import static org.junit.Assert.*;

public class Testnull_17598 {
    private final Productionnull_17598 production = new Productionnull_17598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}