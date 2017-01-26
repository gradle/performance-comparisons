package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25709 {
    private final Productionnull_25709 production = new Productionnull_25709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}