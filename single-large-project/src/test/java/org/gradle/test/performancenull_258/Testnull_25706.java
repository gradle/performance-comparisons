package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25706 {
    private final Productionnull_25706 production = new Productionnull_25706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}