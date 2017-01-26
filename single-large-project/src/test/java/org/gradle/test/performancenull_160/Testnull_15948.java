package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15948 {
    private final Productionnull_15948 production = new Productionnull_15948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}