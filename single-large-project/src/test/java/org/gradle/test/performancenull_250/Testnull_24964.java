package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24964 {
    private final Productionnull_24964 production = new Productionnull_24964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}