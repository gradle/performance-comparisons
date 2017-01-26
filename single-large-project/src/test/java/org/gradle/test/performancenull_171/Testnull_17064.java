package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17064 {
    private final Productionnull_17064 production = new Productionnull_17064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}