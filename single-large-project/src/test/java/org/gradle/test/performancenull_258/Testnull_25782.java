package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25782 {
    private final Productionnull_25782 production = new Productionnull_25782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}