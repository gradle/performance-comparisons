package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25735 {
    private final Productionnull_25735 production = new Productionnull_25735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}