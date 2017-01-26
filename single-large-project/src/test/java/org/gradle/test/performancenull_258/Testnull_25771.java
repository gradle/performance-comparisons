package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25771 {
    private final Productionnull_25771 production = new Productionnull_25771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}