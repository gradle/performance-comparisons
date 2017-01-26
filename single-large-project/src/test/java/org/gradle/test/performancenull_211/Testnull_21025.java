package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21025 {
    private final Productionnull_21025 production = new Productionnull_21025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}