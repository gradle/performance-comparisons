package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28026 {
    private final Productionnull_28026 production = new Productionnull_28026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}