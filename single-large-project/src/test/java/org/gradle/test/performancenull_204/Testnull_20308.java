package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20308 {
    private final Productionnull_20308 production = new Productionnull_20308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}