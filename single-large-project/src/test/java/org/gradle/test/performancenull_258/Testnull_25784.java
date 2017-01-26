package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25784 {
    private final Productionnull_25784 production = new Productionnull_25784("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}