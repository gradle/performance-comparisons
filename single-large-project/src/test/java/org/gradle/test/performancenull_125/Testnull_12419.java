package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12419 {
    private final Productionnull_12419 production = new Productionnull_12419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}