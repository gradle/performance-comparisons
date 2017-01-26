package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18025 {
    private final Productionnull_18025 production = new Productionnull_18025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}