package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18245 {
    private final Productionnull_18245 production = new Productionnull_18245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}