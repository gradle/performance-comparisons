package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17948 {
    private final Productionnull_17948 production = new Productionnull_17948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}