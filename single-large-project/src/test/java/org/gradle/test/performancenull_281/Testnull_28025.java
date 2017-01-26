package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28025 {
    private final Productionnull_28025 production = new Productionnull_28025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}