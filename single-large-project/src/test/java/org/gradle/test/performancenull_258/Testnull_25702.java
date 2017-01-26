package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25702 {
    private final Productionnull_25702 production = new Productionnull_25702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}