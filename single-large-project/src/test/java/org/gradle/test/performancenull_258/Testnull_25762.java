package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25762 {
    private final Productionnull_25762 production = new Productionnull_25762("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}